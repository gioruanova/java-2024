package stateLampara;

public class Lampara {
    private EstadoLampara estado;
    private String marca;

    public Lampara() {
        estado = new LamparaApagada();
    }

    public void setEstado(EstadoLampara nuevoEstado) {
        estado = nuevoEstado;
    }

    public void encender() {
        if (this.estado instanceof LamparaEncendida) {
            System.out.println("La lampara ya esta encendida");
        } else {
            estado.encender(this);
        }
    }

    public void apagar() {
        estado.apagar(this);
    }
}