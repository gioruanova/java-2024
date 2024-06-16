package clases;

public class PaqueteFragil extends Paquete {
    private Fragilidad fragilidad;

    public PaqueteFragil(Sucursal destino, double peso, Fragilidad fragilidad) {
        super(destino, peso);
        this.fragilidad = fragilidad;
    }

    public Fragilidad getFragilidad() {
        return fragilidad;
    }

    @Override
    public String toString() {
        return super.toString() + " | CUIDADO: " + fragilidad.getDescripcion();
    }
}
