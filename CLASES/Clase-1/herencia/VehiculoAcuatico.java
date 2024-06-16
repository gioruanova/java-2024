package herencia;

public class VehiculoAcuatico extends Vehiculo {

    public static final String MSG = "MENSAJE PULICO";

    public VehiculoAcuatico(String colorPrincipal, String marca) {
        super(colorPrincipal, marca);
        // TODO Auto-generated constructor stub
    }

    public VehiculoAcuatico() {

    }

    public void testPrivate() {
        String color = super.getColorPublic();
        super.getColorPrincipal();
    }

    protected int cantidadMotores;
    protected boolean tieneCarga;

    public int getCantidadMotores() {
        return cantidadMotores;
    }

    public void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }

    public boolean isTieneCarga() {
        return tieneCarga;
    }

    public void setTieneCarga(boolean tieneCarga) {
        this.tieneCarga = tieneCarga;
    }

    public void subClase() {
        super.metodoGerenal();
    }

    @Override
    public void frenar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frenar'");
    }

    @Override
    public String getColorPrincipal() {
        return super.getColorPrincipal();
    }

}
