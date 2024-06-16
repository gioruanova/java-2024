package ejercicioElectrodomestico;

public class Televisor extends Electrodomestico {

    private int dimension;
    private boolean esSmart;

    public Televisor(String marca, String modelo, String numeroSerie, int voltaje, double precio,
            int dimension, boolean esSmart) {
        super(marca, modelo, numeroSerie, voltaje, precio);
        this.dimension = dimension;
        this.esSmart = esSmart;
        // TODO Auto-generated constructor stub
    }

}
