package main;

import clases.Supermercado;

public class MainSupermercado {

    public static void main(String[] args) {

        Supermercado supermercado = new Supermercado("Tu mejor elección");

        try {
            supermercado.getProductos().forEach(System.out::println);
            System.out.println("=============================");
            System.out.println("Producto mas caro: " + supermercado.productoMasCaro());
            System.out.println("Producto mas barato: " + supermercado.productoMasBarato());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
