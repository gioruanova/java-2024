package clases;

import java.math.BigDecimal;

public class Fruta extends Producto {

    private final String MSG_FRUTA = "Nombre: %s ///  Precio: $%s /// Unidad de venta: %s ";

    private String unidadDeVenta;

    public Fruta(String nombre, BigDecimal precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    @Override
    public String toString() {
        return String.format(MSG_FRUTA, getNombre(), getPrecio(), getUnidadDeVenta());
    }

}
