package clases;

import java.util.List;

import excepciones.CustomException;
import utils.ListaDeProductos;

public class Supermercado {

    private final String MSG_PRODUCTO_MAS_CARO = "El producto mas caro es: %s";
    private final String MSG_PRODUCTO_MAS_BARATO = "El producto mas barato es: %s";

    private String nombre;
    private List<Producto> productos;

    public Supermercado(String nombre) {
        this.nombre = nombre;
        setProductos(ListaDeProductos.listaProductos());
    }

    private void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String productoMasBarato() {
        // return this.productos.stream().sorted().findFirst().get().getNombre();
        // return this.productos.stream()
        // .sorted()
        // .findFirst()
        // .map(p -> String.format(MSG_PRODUCTO_MAS_BARATO, p.getNombre()))
        // .orElse("No hay productos en la lista de supermercado");
        return this.productos.stream()
                .sorted()
                .findFirst()
                .map(p -> String.format(MSG_PRODUCTO_MAS_BARATO, p.getNombre()))
                .orElseThrow(() -> new CustomException());
    }

    public String productoMasCaro() {
        // return this.productos.stream()
        // .sorted((p1, p2) -> p2.getPrecio().compareTo(p1.getPrecio()))
        // .findFirst()
        // .get()
        // .getNombre();
        return this.productos.stream()
                .sorted((p1, p2) -> p2.getPrecio().compareTo(p1.getPrecio()))
                .findFirst()
                .map(p -> String.format(MSG_PRODUCTO_MAS_CARO, p.getNombre()))
                // .orElse("No hay productos en la lista de supermercado");
                .orElseThrow(() -> new CustomException());
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

}
