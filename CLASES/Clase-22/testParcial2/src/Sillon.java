public class Sillon extends Mueble {

    private int cantidadCuerpos;
    private String tipoTela;

    public Sillon(String modelo, Double costoBase, Double procentajeGanancia, int cantidadCuerpos, String tipoTela) {
        super(modelo, costoBase, procentajeGanancia);
        this.cantidadCuerpos = cantidadCuerpos;
        this.tipoTela = tipoTela;
    }

    // (costo base * cantidad de cuerpos * porcentaje adicional por tela)

    @Override
    public double calcularPrecioCosto() {
        double multiplicador = switch (tipoTela.toLowerCase()) {
            case "algodon" -> 1.1;
            case "cuero" -> 1.5;
            case "sintetico" -> 1.2;
            default -> 1.0;
        };
        return costoBase * cantidadCuerpos * multiplicador;
    }

    @Override
    public void mostrar() {
        System.out.println("Tipo de Mueble: " + this.getClass().getSimpleName());
        super.mostrar();
    }

}
