package clases;

import java.math.BigDecimal;

public class AseoPersonal extends Producto {

    private final String MSG_ASEO = "Nombre: %s /// Contenido: %sml /// Precio: $%s";

    private Integer contenido;

    public AseoPersonal(String nombre, BigDecimal precio, Integer contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public Integer getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return String.format(MSG_ASEO, getNombre(), getContenido(), getPrecio());
    }

}
