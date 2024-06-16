package designPatterns;

public class Duenio {
    private String nombre;
    private String apellido;

    public Duenio(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Realizando la comparación de nombre y apellido
        Duenio otroDuenio = (Duenio) obj;
        return nombre.equals(otroDuenio.nombre) && apellido.equals(otroDuenio.apellido);
    }

    @Override
    public int hashCode() {
        int resultado = nombre.hashCode();
        resultado = 31 * resultado + apellido.hashCode();
        return resultado;
    }

}
