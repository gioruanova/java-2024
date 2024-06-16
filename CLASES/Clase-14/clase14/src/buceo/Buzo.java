package buceo;

import java.util.ArrayList;
import java.util.List;

import buceo.excepciones.ExcepcionEdad;
import buceo.excepciones.ExcepcionNacionalidad;
import buceo.excepciones.ExcepcionNombre;

public abstract class Buzo implements ProfundidadBuceos {

    protected final int PROFUNDIDAD_MAXIMA_PERMITIDA_OP = 22;
    protected final int PROFUNDIDAD_MAXIMA_PERMITIDA_AOP = 30;

    private String nombre;
    private String nacionalidad;
    private int edad;
    private List<Buceo> buceos;

    public Buzo(String nombre, String nacionalidad, int edad) throws ExcepcionNombre {
        this.buceos = new ArrayList<>();
        setNombre(nombre);
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public void setNombre(String nombre) throws ExcepcionNombre {
        if (nombre == null || nombre.isEmpty()) {
            throw new ExcepcionNombre();
        }
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) throws ExcepcionNacionalidad {
        if (nacionalidad == null || nacionalidad.isEmpty()) {
            throw new ExcepcionNacionalidad();
        }
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int edad) throws ExcepcionEdad {
        if (edad < 18) {
            throw new ExcepcionEdad();
        }
        this.edad = edad;
    }

    protected abstract boolean habilitado(int metros);

}
