package practicaHerencia;

public abstract class Animal implements Volador, Trepables {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // void comunicar();

    // void comer();

    // void dormir();

}
