package excepciones;

public class ExcepcionFlete extends Exception{

    public ExcepcionFlete() {
        super("Ya existe un flete con la patente: ");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
