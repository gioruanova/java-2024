package clases;

import java.util.ArrayList;
import java.util.Comparator;

import excepciones.ExcepcionFlete;
import interfaz.Despachable;

public class Flete<T extends Paquete> implements Despachable {
    private static final double PORCENTAJE_UMBRAL_LLENADO = 80;

    private String patente;
    private double cargaMaxima;
    private double cargaActual;
    private Sucursal destino;
    private ArrayList<T> paquetes;

    public Flete(String patente, double cargaMaxima) throws ExcepcionFlete {
        this.patente = patente;
        this.cargaMaxima = cargaMaxima;
        paquetes = new ArrayList<>();
    }

    public String getPatente() {
        return patente;
    }

    public boolean mismaPatente(String patente) {
        return this.patente.equals(patente);
    }

    @Override
    public boolean esDespachable() {
        return (this.cargaActual / this.cargaMaxima) * 100 >= PORCENTAJE_UMBRAL_LLENADO;
    }

    private boolean puedeCargar(T paquete) {
        return (this.destino == null || paquete.getDestino() == this.destino) && this.cargaActual <= this.cargaMaxima;
    }

    public void agregarPaquete(T paquete) {
        this.paquetes.add(paquete);
    }

    public boolean cargarPaquete(T paqueteACargar) {
        if (puedeCargar(paqueteACargar)) {
            this.destino = paqueteACargar.getDestino();
            this.cargaActual += paqueteACargar.getPeso();
            agregarPaquete(paqueteACargar);
            return true;
        } else {
            return false;
        }
    }

    public T obtenerPaqueteMasPesado() {
        return paquetes.stream()
                .max(Comparator.comparingDouble(Paquete::getPeso))
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Patente: " + patente
                + " | C Maxima: " + cargaMaxima + " | C Actual: " + cargaActual + " | Ocupacion: %"
                + ((cargaActual / cargaMaxima) * 100) + " | Destino: " + destino
                + "\n" + paquetes + "\n";
    }
}
