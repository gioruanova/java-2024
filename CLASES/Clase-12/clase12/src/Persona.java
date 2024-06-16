public class Persona implements Comparable<Persona> {

    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " Edad: " + this.getEdad();
    }

    // @Override
    public int compareTo(Persona p) {
        return this.getNombre().compareTo(p.getNombre());
    }
}
