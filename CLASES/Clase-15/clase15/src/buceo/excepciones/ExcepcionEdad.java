package buceo.excepciones;

public class ExcepcionEdad extends Exception {

    public ExcepcionEdad() {
        super("La edad debe ser mayor o igual a 18");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
