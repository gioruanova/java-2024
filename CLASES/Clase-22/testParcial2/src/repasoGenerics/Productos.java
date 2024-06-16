package repasoGenerics;

import java.util.List;

public class Productos {

    public static void mostrar(List<Caja<?>> cajas) {

        // Alternativa 1
        for (Caja<?> caja : cajas) {
            caja.toString();
        }

        // Alternativa 2
        cajas.forEach(x -> System.out.println(x.toString()));
    }

}
