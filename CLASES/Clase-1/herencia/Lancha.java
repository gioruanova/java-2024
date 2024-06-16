package herencia;

public class Lancha extends VehiculoAcuatico {

    private int cantidadDeMotores;

    public Lancha(String colorPrincipal, String marca, Integer cantidadDeMotores) {
        super(colorPrincipal, marca);
        this.cantidadDeMotores = cantidadDeMotores;
    }

    public Lancha() {

    }

    public void subsubclase() {
        super.getColorPrincipal();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Lancha [cantidadDeMotores=" + cantidadDeMotores + ", marca=" + marca + "]";
    }

}
