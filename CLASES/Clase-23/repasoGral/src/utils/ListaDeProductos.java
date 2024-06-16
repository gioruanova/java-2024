package utils;

import java.math.BigDecimal;
import java.util.List;

import clases.AseoPersonal;
import clases.Bebida;
import clases.Fruta;
import clases.Producto;

public class ListaDeProductos {

    public static List<Producto> listaProductos() {

        return List.of(
                new Bebida("Coca-Cola Zero", new BigDecimal(20), 1.5),
                new Bebida("Coca-Cola", new BigDecimal(18), 1.5),
                new AseoPersonal(" Shampoo Sedal", new BigDecimal(19), 500),
                new Fruta("Frutillas", new BigDecimal(64), "kilo"));

        // return List.of();
    }

}
