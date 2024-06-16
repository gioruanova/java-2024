public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        setNombre(nombre);
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    private void setNombre(String nombre) throws NullPointerException {
        if (nombre.isEmpty() || nombre == null) {
            throw new RuntimeException("El nombre no puede ser nulo");
        }
        this.nombre = nombre;

        // if (nombre.isEmpty() || nombre == null) {
        // System.out.println("El nombre no puede ser nulo");
        // }
        // this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
