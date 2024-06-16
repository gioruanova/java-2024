package polimorfismo;

public abstract class Mascota {

    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void saludar();

}
