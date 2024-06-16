public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Supongamos que implementamos el método hashCode de manera que siempre retorne
    // el mismo valor
    @Override
    public int hashCode() {
        return 123; // Un valor arbitrario para demostrar la colisión de hash
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Persona persona = (Persona) obj;
        return edad == persona.edad && nombre.equals(persona.nombre);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
