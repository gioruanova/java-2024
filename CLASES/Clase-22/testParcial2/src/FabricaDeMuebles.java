import java.util.ArrayList;
import java.util.List;

import interfaz.Fabricable;
import interfaz.Mostrable;
import interfaz.Notificable;

public class FabricaDeMuebles<T extends Mueble> implements Mostrable, Fabricable<T> {

    private String nombre;
    private List<T> mueblesFabricados;
    private List<Notificable> notificaciones;

    public FabricaDeMuebles(String nombre) {
        this.nombre = nombre;
        this.mueblesFabricados = new ArrayList<>();
        this.notificaciones = new ArrayList<>();
    }

    @Override
    public boolean fabricar(T mueble) {
        if (mueble != null) {
            this.mueblesFabricados.add(mueble);
            this.enviarNotificacion("Se ha fabricado el mueble: " + mueble.getModelo());
            return true;
        }
        return false;
    }

    @Override
    public boolean seHaFabricado(String modelo) {
        return this.mueblesFabricados.stream().anyMatch(m -> m.modeloCorrecto(modelo));
    }

    public void addNotificacion(Notificable notificacion) {
        this.notificaciones.add(notificacion);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre de la fábrica: " + nombre);
        long cantidadMesas = mueblesFabricados.stream().filter(m -> m instanceof Mesa).count();
        long cantidadSillas = mueblesFabricados.stream().filter(m -> m instanceof Silla).count();
        long cantidadSillones = mueblesFabricados.stream().filter(m -> m instanceof Sillon).count();
        // double importeTotalVentas =
        // mueblesFabricados.stream().mapToDouble((Mueble::calcularPrecioVenta).sum();

        System.out.println("Cantidad de Mesas fabricadas: " + cantidadMesas);
        System.out.println("Cantidad de Sillas fabricadas: " + cantidadSillas);
        System.out.println("Cantidad de Sillones fabricadas: " + cantidadSillones);
        // System.out.println("Importe total de las ventas: " + importeTotalVentas);
    }

    public void enviarNotificacion(String msg) {
        for (Notificable n : notificaciones) {
            n.enviarNotificacion(msg);
        }
    }

}
