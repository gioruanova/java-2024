package clases;

public class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Number peso;

    public Persona(String nombre, String apellido, Integer edad, Number peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona() {
        this.edad = 0;
        this.nombre = "";
        this.apellido = "default";
        this.peso = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Number getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", peso=" + peso + "]";
    }

}
