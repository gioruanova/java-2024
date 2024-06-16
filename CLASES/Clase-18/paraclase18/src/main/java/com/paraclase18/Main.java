package com.paraclase18;

import java.util.List;

import controller.MotoController;
import dao.MotoDao;
import model.Moto;
import services.MotoService;
import services.MotoServiceImplementacion;

public class Main {
    public static void main(String[] args) {
        MotoDao motoDao = MotoDao.getInstance();
        MotoService motoService = new MotoServiceImplementacion(motoDao);
        MotoController motoController = new MotoController(motoService);

        /*
         * DAO maneja logica para agregar datos a nuestra base de datos
         * Utiliza metodos para obtener los datos
         * Controlador es la capa mas abstracta
         * usando el service
         */
        // Crear motos
        motoController.createMoto(new Moto(1, "Honda", "R1000", "Rojo", "990cc"));
        motoController.createMoto(new Moto(2, "Yamaha", "R7", "Azul", "750cc"));
        motoController.createMoto(null);

        // Obtener todos los motos
        List<Moto> motos = motoController.getAllMotos();
        motos.forEach(moto -> System.out.println(moto.toString()));

        // Actualizar un moto
        motoController.updateMoto(new Moto(2, "Yamaha", "R7", "Blanca", "790cc"));
        motoController.updateMoto(new Moto(2, null, "R7", "Blanca", "790cc"));

        // Obtener un moto por ID
        Moto moto = motoController.getMotoById(2);
        // System.out.println(moto.toString());
        System.out.println(motoController == null ? "" : moto.toString());

        // Eliminar un moto
        motoController.deleteMoto(2);

        System.out.println("Luego de borrar un registro de nuestra DB: ");
        motoController.getAllMotos().forEach(m -> System.out.println(m.toString()));

    }
}