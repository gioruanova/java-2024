package ejercicioElectrodomestico;

public abstract class Electrodomestico {

    private String marca;
    private String modelo;
    private String numeroSerie;
    private int voltaje;
    private boolean encendido;
    private double precio;

    public Electrodomestico(String marca, String modelo, String numeroSerie, int voltaje,
            double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.voltaje = voltaje;
        setApagado();
        this.precio = precio;
    }

    public Electrodomestico() {
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + "[marca=" + marca + ", modelo=" + modelo + ", numeroSerie="
                + numeroSerie + ", voltaje="
                + voltaje + ", encendido=" + encendido + ", precio=" + precio + "]";
    }

    public void setEncendido() {
        this.encendido = true;
    }

    public void setApagado() {
        this.encendido = false;
    }

}
