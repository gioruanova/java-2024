package state;

public class Contexto {

    private Estado estado;

    public Contexto(Estado estado) {
        this.estado = estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void manejarEstado() {
        estado.cambiarEstado(this);
    }

}
