package repasoGenerics;

import java.util.List;

public class MainTest {

    public static void main(String[] args) {

        Caja<String> cajaDeStrings = new Caja<>("Soy un objeto String");
        Caja<Integer> cajaDeNumeros = new Caja<>(1000);
        Caja<Persona> cajaDePersonas = new Caja<>(new Persona("Pepe"));

        List<Caja<?>> listaDeCajas = List.of(cajaDeStrings, cajaDeNumeros, cajaDePersonas);

        Productos.mostrar(listaDeCajas);

    }

}
