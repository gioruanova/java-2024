public class Mesa extends Mueble {

    private int largo;
    private int ancho;
    private String tipo;

    public Mesa(String modelo, double precioVenta, double procentajeGanancia, int largo, int ancho, String tipo) {
        super(modelo, precioVenta, procentajeGanancia);
        this.ancho = ancho;
        this.largo = largo;
        this.tipo = tipo;
    }

    @Override
    public void mostrar() {
        System.out.println("Tipo de Mueble: " + this.getClass().getSimpleName());
        super.mostrar();
    }

    @Override
    public double calcularPrecioCosto() {
        // double multiplicador = 0;

        // switch (this.tipo.toLowerCase()) {
        // case "moderna":
        // multiplicador = 1.5;
        // break;
        // case "antigua":
        // multiplicador = 1.8;
        // break;
        // case "cristal":
        // multiplicador = 2.0;
        // break;
        // }

        double multiplicador = switch (this.tipo.toLowerCase()) {
            case "moderna" -> 1.5;
            case "antigua" -> 1.8;
            case "cristal" -> 2.0;
            default -> 0.0;
        };

        // (costo base * multiplicador del tipo de mesa + 0.2 * largo * ancho)

        return costoBase * multiplicador + 0.2 * (largo * ancho);

    }

}
