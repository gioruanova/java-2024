import java.util.Date;
import java.util.List;

public abstract class OperacionesEstudiante {

    private Date fecha;

    protected abstract void operacion(Estudiante estudiante);

    public void ejecutarOperacion(List<Estudiante> estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            operacion(estudiante);
        }
    }

    /*
     * n metodos....
     */

}
