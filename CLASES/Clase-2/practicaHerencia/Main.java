package practicaHerencia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Mamifero> animales = new ArrayList<>();

        Mamifero perro = new Perro("Firulais");
        // Animal gato = new Gato();
        // Animal conejo = new Conejo();

        animales.add(perro);
        // animales.add(gato);
        // animales.add(conejo);

        // for (Animal a : animales) {
        // a.comunicar();
        // }

        // Conejo nuevoConejo = (Conejo) conejo;
        // nuevoConejo.saltar();

    }

}
