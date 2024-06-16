package buceo;

import buceo.excepciones.ExcepcionEdad;
import buceo.excepciones.ExcepcionNacionalidad;
import buceo.excepciones.ExcepcionNombre;

public class Tecnico extends Buzo{

    public Tecnico(String nombre, String nacionalidad, int edad) throws ExcepcionNombre, ExcepcionNacionalidad, ExcepcionEdad {
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

}
