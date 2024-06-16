package herencia;

public class VehiculoTerrestre extends Vehiculo {

    public static final String MSG_TERRESTRE = "SOY TERRESTRE";

    protected int cantidadRuedas;

    public VehiculoTerrestre(String colorPrincipal, String marca, int cantidadRuedas) {
        super(colorPrincipal, marca);
        this.cantidadRuedas = cantidadRuedas;
    }

    public VehiculoTerrestre() {
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    /*
     * Obligato a implementar y sobreescribir el metodo
     * abstracto de la clase padre
     */
    @Override
    public void frenar() {
        System.out.println("Frenar / VehiculoTerrestre");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar / VehiculoTerrestre");
    }

    public void hacerOffRoad() {
        System.out.println("Vehiculo terrestre OFFROAD");
    }

}
