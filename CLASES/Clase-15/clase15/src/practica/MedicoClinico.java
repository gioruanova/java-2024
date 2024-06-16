package practica;

public class MedicoClinico implements Medico {

    private String name;

    public MedicoClinico(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Medico o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName();
    }

}
