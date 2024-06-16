import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {

    private final Integer MAX_AMIGOS = 10;

    private String nombre;
    private Integer edad;
    private List<Persona> amigos;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        setEdad(edad);
        this.amigos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new NullPointerException("El nombre no puedo ser nulo o vacio");
        }
        this.nombre = nombre;
    }

    public void addAmigo(Persona p) {
        if (p == null) {
            throw new NullPointerException("La persona no puede ser nula");
        }
        this.amigos.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        if (edad == null || edad <= 0) {
            throw new NullPointerException("La edad no puedo ser nula o negativa");
        }
        this.edad = edad;
    }

    public Integer getMAX_AMIGOS() {
        return MAX_AMIGOS;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((edad == null) ? 0 : edad.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        return edad == other.getEdad() && Objects.equals(edad, other.getEdad());
    }

}
