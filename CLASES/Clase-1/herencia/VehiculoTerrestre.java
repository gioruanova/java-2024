package herencia;

public class VehiculoTerrestre extends Vehiculo {

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frenar'");
    }

}
