package practicaHerencia;

import java.lang.reflect.Array;

public interface Trepables extends Volador, Domesticable {

    String RAZA = "Americano";

    void trepar();

    String[] ALTURAS = { "altura 15 mts", "altura 25 mts" };

}
