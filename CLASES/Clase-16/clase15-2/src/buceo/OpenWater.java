package buceo;

import buceo.excepciones.ExcepcionEdad;
import buceo.excepciones.ExcepcionNacionalidad;
import buceo.excepciones.ExcepcionNombre;

public class OpenWater extends Buzo {

    // private final int PROFUNDIDAD_MAXIMA_PERMITIDA = 22;

    public OpenWater(String nombre, String nacionalidad, int edad)
            throws ExcepcionNombre, ExcepcionNacionalidad, ExcepcionEdad {
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

    public String toString() {
        return "Buzo [nombre=" + super.getNombre() + ", nacionalidad=" + super.getNacionalidad() + ", edad="
                + super.getEdad() + ", profundidad=" + PROFUNDIDAD_MAXIMA_PERMITIDA_OP + "]";
    }

    @Override
    public void agregarBitacora(Buceo t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarBitacora'");
    }

}
