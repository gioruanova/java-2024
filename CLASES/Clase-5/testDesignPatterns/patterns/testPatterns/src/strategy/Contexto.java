package strategy;

public class Contexto {
    private EstrategiaTransporte estrategia;

    public Contexto(EstrategiaTransporte estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaTransporte estrategia) {
        this.estrategia = estrategia;
    }

    public void elegirRuta() {
        estrategia.elegirRuta();
    }
}
