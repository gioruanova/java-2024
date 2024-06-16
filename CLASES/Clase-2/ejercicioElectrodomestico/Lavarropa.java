package ejercicioElectrodomestico;

public class Lavarropa extends Electrodomestico {

    private int maxCarga;
    private boolean esAutomatico;

    public Lavarropa(String marca, String modelo, String numeroSerie, int voltaje,
            double precio, int maxCarga) {
        super(marca, modelo, numeroSerie, voltaje, precio);
        this.maxCarga = maxCarga;
        this.esAutomatico();
        // TODO Auto-generated constructor stub
    }

    public void esAutomatico() {
        this.esAutomatico = true;
    }

    public void noEsAutomatico() {
        this.esAutomatico = false;
    }

}
