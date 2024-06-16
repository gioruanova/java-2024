package ejercicioElectrodomestico;

public class Heladera extends Electrodomestico {

    private int capacidadLitros;
    private boolean esFrost;

    public Heladera(String marca, String modelo, String numeroSerie, int voltaje,
            double precio, int capacidadLitros) {
        super(marca, modelo, numeroSerie, voltaje, precio);
        this.capacidadLitros = capacidadLitros;
        this.esFrost = false;
    }

    public Heladera() {
    }

    public void setEsFrost(boolean esFrost) {
        this.esFrost = esFrost;
    }

    public boolean isEsFrost() {
        return esFrost;
    }

    @Override
    public String toString() {
        return super.toString() + " [capacidadLitros=" + capacidadLitros + ", esFrost=" + this.isEsFrost() + "]";
    }

    public void impirmir() {
        System.out.println("Marca: " + super.getMarca());
    }

}
