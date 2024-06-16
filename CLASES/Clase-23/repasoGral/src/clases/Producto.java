package clases;

import java.math.BigDecimal;

public abstract class Producto implements Comparable<Producto> {

    protected String nombre;
    protected BigDecimal precio;

    public Producto(String nombre, BigDecimal precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return this.getPrecio().compareTo(otroProducto.getPrecio());
    }

}
