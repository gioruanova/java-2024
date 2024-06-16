public class ExcepcionCustomizada extends Exception {

    public ExcepcionCustomizada(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
