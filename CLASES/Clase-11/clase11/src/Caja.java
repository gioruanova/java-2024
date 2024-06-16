import java.util.ArrayList;
import java.util.Iterator;

public class Caja<T> implements Iterable<T>, OpcionesCustomizadas<T> {

    private ArrayList<T> lista = new ArrayList<T>();
    private int cantidad = 0;

    public Caja(int cantidad) {
        this.cantidad = cantidad;
    }

    public void add(T o) {
        if (this.lista.size() < this.cantidad) {
            this.lista.add(o);
        } else {
            throw new RuntimeException("Se alcanzo la capacidad maxima de la caja");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.lista.iterator();
    }

    @Override
    public void guardar(T elemento) {
        // TODO Auto-generated method stub
        this.lista.add(elemento);
    }

    @Override
    public T extraer() {
        return this.lista.removeLast();
    }

    public T remover() {
        T elemento = null;
        if (!this.lista.isEmpty()) {
            int pos = (int) Math.random() * this.lista.size();
            elemento = this.lista.remove(pos);
        }
        return elemento;
    }

}
