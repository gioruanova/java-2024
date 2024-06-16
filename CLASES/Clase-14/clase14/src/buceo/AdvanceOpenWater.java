package buceo;

import buceo.excepciones.ExcepcionNombre;

public class AdvanceOpenWater extends Buzo {

    public AdvanceOpenWater(String nombre, String nacionalidad, int edad) throws ExcepcionNombre {
        super(nombre, nacionalidad, edad);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean buceosProfundos() {
        return false;
    }

    @Override
    public boolean buceosMedios() {
        return true;
    }

    @Override
    protected boolean habilitado(int metros) {
        return metros <= PROFUNDIDAD_MAXIMA_PERMITIDA_AOP ? true : false;
    }

}
