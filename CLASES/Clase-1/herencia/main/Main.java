package herencia.main;

import java.util.ArrayList;
import java.util.List;

import herencia.Lancha;
import herencia.Moto;
import herencia.Vehiculo;
import herencia.VehiculoAcuatico;

public class Main {

    public static void main(String[] args) {
        Vehiculo primeraMoto = new Moto("Roja", "Ducati", 2, "deportiva", 1100);
        Moto segundaMoto = new Moto("Negro", "Harley Davidson", 2, "custom", 900);
        Lancha primeraLancha = new Lancha("Verde", "Greenpeace", 3);
        VehiculoAcuatico primerVehiculoAcuatico = new VehiculoAcuatico();

        System.out.println("Muestro los atributos que asigne en el constructor: ");
        System.out.println(primeraMoto.getMarca());
        System.out.println(segundaMoto.getMarca());
        /*
         * Puedo setear atributos como lo vimos en clase
         * siempre y cuando la superclase nos lo permita
         * mediante metodos.
         * "Como los setters estan privados, voy a acceder a modificar
         * atributos con otos metodos creados"
         */
        System.out.println("********************************");
        System.out.println("Modifico mediante un metodo esos atributos: ");
        primeraMoto.modificarMarca("Aprilia");
        segundaMoto.modificarMarca("Indian");
        System.out.println("********************************");
        System.out.println("Muestro los atributos modificados: ");
        System.out.println(primeraMoto.getMarca());
        System.out.println(segundaMoto.getMarca());

        List<Vehiculo> myList = new ArrayList<>();
        myList.add(primeraMoto);
        myList.add(segundaMoto);
        myList.add(primeraLancha);
        myList.add(primerVehiculoAcuatico);

        for (Vehiculo vehiculo : myList) {
            /*
             * Si quiero acceder a un tipo especifico
             * de vehiculo, utilizo instanceof
             */
            if (vehiculo instanceof Lancha) {
                Lancha l = (Lancha) vehiculo;
                System.out.println(l.getMarca());
            }
        }

    }

}
