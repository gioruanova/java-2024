public class ExcepcionCustomizada extends RuntimeException {

    public ExcepcionCustomizada(String msg) {
        super("msg: " + msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
