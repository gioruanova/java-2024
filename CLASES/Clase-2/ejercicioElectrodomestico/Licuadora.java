package ejercicioElectrodomestico;

public class Licuadora extends Electrodomestico {

    private int potencia;
    private int cantVelocidades;

    public Licuadora(String marca, String modelo, String numeroSerie, int voltaje,
            double precio, int potencia, int cantVelocidades) {
        super(marca, modelo, numeroSerie, voltaje, precio);
        this.cantVelocidades = cantVelocidades;
        this.potencia = potencia;
        // TODO Auto-generated constructor stub
    }

}
