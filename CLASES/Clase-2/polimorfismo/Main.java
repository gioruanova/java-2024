package polimorfismo;

import java.util.ArrayList;
import java.util.List;

import herencia.Moto;

public class Main {

    public static void main(String[] args) {

        List<Mascota> mascotas = new ArrayList<>();

        Perro perro = new Perro("Firulais", "Callejero");
        Gato michi = new Gato("Michi");
        Pato pato = new Pato("Ducky");

        perro.saludar();
        michi.saludar();
        pato.saludar();

        /*
         * n...saludar();
         * n...saludar();
         * n...saludar();
         * n...saludar();
         */

    }

}
