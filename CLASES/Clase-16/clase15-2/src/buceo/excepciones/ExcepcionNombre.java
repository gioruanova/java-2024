package buceo.excepciones;

public class ExcepcionNombre extends Exception {

    public ExcepcionNombre() {
        super("El nombre no puede ser nulo o vacio");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
