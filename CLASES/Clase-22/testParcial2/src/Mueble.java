import interfaz.Costeable;
import interfaz.Mostrable;

public class Mueble implements Mostrable, Costeable {

    protected String modelo;
    protected Double costoBase;
    protected Double procentajeGanancia;

    public Mueble(String modelo, Double costoBase, Double procentajeGanancia) {
        this.modelo = modelo;
        this.costoBase = costoBase;
        this.procentajeGanancia = procentajeGanancia;
    }

    public double calcularCostoBase() {
        return calcularPrecioCosto() * (1 + procentajeGanancia / 100);
    }

    public boolean modeloCorrecto(String modelo) {
        return this.modelo.equalsIgnoreCase(modelo);
    }

    @Override
    public double calcularPrecioCosto() {
        return 0;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void mostrar() {
        System.out.println("Modelo: " + modelo);
        System.out.println("PRecio de Venta: " + this.calcularPrecioCosto());
    }

}
