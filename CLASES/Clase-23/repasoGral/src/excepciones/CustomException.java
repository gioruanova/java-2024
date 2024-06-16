package excepciones;

public class CustomException extends RuntimeException {

    public CustomException() {
        super("No hay productos en la lista!!!");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
