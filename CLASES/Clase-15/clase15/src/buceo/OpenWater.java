package buceo;

import buceo.excepciones.ExcepcionEdad;
import buceo.excepciones.ExcepcionNacionalidad;
import buceo.excepciones.ExcepcionNombre;

public class OpenWater extends Buzo {

    // private final int PROFUNDIDAD_MAXIMA_PERMITIDA = 22;

    public OpenWater(String nombre, String nacionalidad, int edad) throws ExcepcionNombre, ExcepcionNacionalidad, ExcepcionEdad {
        super(nombre, nacionalidad, edad);
    }

    @Override
    public boolean buceosProfundos() {
        return false;
    }

    @Override
    public boolean buceosMedios() {
        return false;
    }

    @Override
    protected boolean habilitado(int metros) {
        return metros <= PROFUNDIDAD_MAXIMA_PERMITIDA_OP ? true : false;
    }

}
