package buceo;

import buceo.excepciones.ExcepcionEdad;
import buceo.excepciones.ExcepcionNacionalidad;
import buceo.excepciones.ExcepcionNombre;

public class Tecnico extends Buzo {

    public Tecnico(String nombre, String nacionalidad, int edad)
            throws ExcepcionNombre, ExcepcionNacionalidad, ExcepcionEdad {
        super(nombre, nacionalidad, edad);
    }

    @Override
    public boolean buceosProfundos() {
        return true;
    }

    @Override
    public boolean buceosMedios() {
        return true;
    }

    @Override
    protected boolean habilitado(int metros) {
        return true;
    }

    public String toString() {
        return "Buzo [nombre=" + super.getNombre() + ", nacionalidad=" + super.getNacionalidad() + ", edad="
                + super.getEdad() + ", profundidad=" + "LIBRE" + "]";
    }

    @Override
    public void agregarBitacora(Buceo t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarBitacora'");
    }

}
