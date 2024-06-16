package excepciones;

public class MotoCreateExcepcion extends RuntimeException {

    public MotoCreateExcepcion(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }
}
