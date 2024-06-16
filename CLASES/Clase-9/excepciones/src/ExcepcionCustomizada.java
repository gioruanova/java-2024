public class ExcepcionCustomizada extends Exception {

    public ExcepcionCustomizada(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
