package buceo;

import java.util.Comparator;
import java.util.List;

public class ListaBuceosPorId<T extends Comparable<? super T>> {

    private List<T> dato;

    public ListaBuceosPorId(List<T> dato) {
        this.dato = dato;
    }

    public ListaBuceosPorId() {
        
    }

    

    public void ordenar() {
        this.dato.sort(Comparator.naturalOrder());
    }

    public T get(int idx) {
        return this.dato.get(idx);
    }

}
