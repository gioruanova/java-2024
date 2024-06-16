package buceo.excepciones;

public class ErroresReserva extends RuntimeException {

    public ErroresReserva(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }
}
