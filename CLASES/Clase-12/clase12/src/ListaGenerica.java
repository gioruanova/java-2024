import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaGenerica <T extends Comparable<T>> {

    private List<T> lista;

    public ListaGenerica() {
        this.lista = new ArrayList<T>();
    }

    public void agregar(T elemento) {
        this.lista.add(elemento);
    }

    void mostrar() {
        for (T elemento : this.lista) {
            System.out.println(elemento.toString());
        }
    }

    public void ordenarDeMayorAMenor() {
        Collections.sort(lista, Collections.reverseOrder());
    }

    public void ordenarDeMenorAMayor() {
        Collections.sort(lista);
    }

    public void ordenarPorEdadMenorMayor() {
        lista.sort((p1, p2) -> ((Persona) p1).getEdad().compareTo(((Persona) p2).getEdad()));
    }

    public void ordenarPorEdadMayorMenor() {
        lista.sort((p1, p2) -> ((Persona) p2).getEdad().compareTo(((Persona) p1).getEdad()));
    }

}
