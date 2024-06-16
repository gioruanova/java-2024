public abstract class Asiento {

    public final static Integer PRECIO_PRIMERA = 150000;
    public final static Integer PRECIO_TURISTA = 50000;
    public final static Integer PRECIO_BUSINESS = 100000;

    private Pasajero pasajero;
    private Integer precio = 0;
    private String fila;
    private int numero;

    public Asiento(Pasajero pasajero, String fila, int numero) {
        this.pasajero = pasajero;
        setPrecioSegunClase();
        this.fila = fila;
        this.numero = numero;
    }

    protected void setPrecioSegunClase() {
        switch (this.getClass().getSimpleName()) {
            case "AsientoTurista":
                this.precio = Asiento.PRECIO_TURISTA;
                break;
            case "AsientoPrimera":
                this.precio = Asiento.PRECIO_PRIMERA;
                break;
            case "AsientoBusiness":
                this.precio = Asiento.PRECIO_BUSINESS;
                break;
        }
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getFila() {
        return fila;
    }

    public int getNumero() {
        return numero;
    }

}
