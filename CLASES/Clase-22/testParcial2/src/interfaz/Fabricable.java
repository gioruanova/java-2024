package interfaz;

public interface Fabricable<T> {

    boolean fabricar(T mueble);

    boolean seHaFabricado(String modelo);
}