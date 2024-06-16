package clases;

import java.math.BigDecimal;

public class Bebida extends Producto {

    private final String MSG_BEBIDA = "Nombre: %s /// Litros: %.1f /// Precio: $%s";

    private Double litros;

    public Bebida(String nombre, BigDecimal precio, Double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public Double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        return String.format(MSG_BEBIDA, getNombre(), getLitros(), getPrecio());
    }

}
