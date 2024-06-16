package buceo;

import java.util.ArrayList;
import java.util.List;

import buceo.excepciones.ExcepcionEdad;
import buceo.excepciones.ExcepcionNacionalidad;
import buceo.excepciones.ExcepcionNombre;

public abstract class Buzo implements ProfundidadBuceos, Bitacora<Buceo> {

    protected final int PROFUNDIDAD_MAXIMA_PERMITIDA_OP = 22;
    protected final int PROFUNDIDAD_MAXIMA_PERMITIDA_AOP = 30;

    private String nombre;
    private String nacionalidad;
    private int edad;
    protected List<Buceo> buceos;

    public Buzo(String nombre, String nacionalidad, int edad)
            throws ExcepcionNombre, ExcepcionNacionalidad, ExcepcionEdad {
        this.buceos = new ArrayList<>();
        setNombre(nombre);
        setNacionalidad(nacionalidad);
        setEdad(edad);
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

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    // @Override
    // public String toString() {
    // return "Buzo [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ",
    // edad=" + edad + "]";
    // }

    protected abstract boolean habilitado(int metros);

}
