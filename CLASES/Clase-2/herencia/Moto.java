package herencia;

public class Moto extends VehiculoTerrestre {

    private String estilo;
    private int cc;

    public Moto(String colorPrincipal, String marca, int cantidadRuedas, String estilo, int cc) {
        super(colorPrincipal, marca, cantidadRuedas);
        this.estilo = estilo;
        this.cc = cc;
    }

    public Moto() {
    }

    public String getEstilo() {
        return estilo;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando la moto");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando la moto");
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    // public void hacerOffRoad() {
    // System.out.println("Hago offroad en mi moto");
    // }

}
