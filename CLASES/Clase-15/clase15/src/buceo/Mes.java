package buceo;

public enum Mes {

    ENERO("Enero"), FEBRERO("Febrero"), MARZO("Marzo"), ABRIL("Abril"), MAYO("Mayo"), JUNIO("Junio"),
    JULIO("Julio"), AGOSTO("Agosto"), SEPTIEMBRE("Septiembre"), OCTUBRE("Octubre"),
    NOVIEMBRE("Noviembre"), DICIEMBRE("Diciembre");

    private String mes;

    private Mes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }
}
