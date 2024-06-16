public enum EnumSingleton {

    ENERO("Enero", 1),
    FEBRERO("Febrero", 2),
    MARZO("Marzo", 3),
    ABRIL("Abril", 4),
    MAYO("Mayo", 5),
    JUNIO("Junio", 6),
    JULIO("Julio", 7),
    AGOSTO("Agosto", 8),
    SEPTIEMBRE("Septiembre", 9),
    OCTUBRE("Octubre", 10),
    NOVIEMBRE("Noviembre", 11),
    DICIEMBRE("Diciembre", 12);

    private final int numero;
    private final String descripcion;

    private EnumSingleton(String descripcion, int numero) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumero() {
        return numero;
    }

}
