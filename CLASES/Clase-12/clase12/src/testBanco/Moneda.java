package testBanco;

public abstract class Moneda {

    String nombre;

    public Moneda(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
