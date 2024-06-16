package buceo.excepciones;

public class ExcepcionNacionalidad extends Exception {

    public ExcepcionNacionalidad() {
        super("La nacionalidad no puede ser nula o vacia");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
