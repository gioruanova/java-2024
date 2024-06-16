package buceo;

import buceo.excepciones.ExcepcionEdad;
import buceo.excepciones.ExcepcionNacionalidad;
import buceo.excepciones.ExcepcionNombre;

public class AdvanceOpenWater extends Buzo {

    public AdvanceOpenWater(String nombre, String nacionalidad, int edad)
            throws ExcepcionNombre, ExcepcionNacionalidad, ExcepcionEdad {
        super(nombre, nacionalidad, edad);
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

    @Override
    public String toString() {
        return "Buzo [nombre=" + super.getNombre() + ", nacionalidad=" + super.getNacionalidad() + ", edad="
                + super.getEdad() + ", profundidad=" + PROFUNDIDAD_MAXIMA_PERMITIDA_AOP + "]";
    }

    @Override
    public void agregarBitacora(Buceo t) {
        super.buceos.add(t);
    }

}
