package excepciones;

public class ExcepcionDespachar extends Exception {

    public ExcepcionDespachar() {
        super("con capacidad al: % ");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
