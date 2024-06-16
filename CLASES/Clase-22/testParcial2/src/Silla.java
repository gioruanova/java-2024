public class Silla extends Mueble {

    private int alto;
    private String material;

    public Silla(String modelo, Double costoBase, Double procentajeGanancia, int alto, String material) {
        super(modelo, costoBase, procentajeGanancia);
        this.alto = alto;
        this.material = material;
    }

    // (costo base + multiplicador del material * alto)

    @Override
    public double calcularPrecioCosto() {
        double multiplicador = switch (this.material.toLowerCase()) {
            case "madera" -> 1.0;
            case "metal" -> 1.5;
            case "plastico" -> 0.8;
            default -> 1.0;
        };
        return costoBase + multiplicador * alto;
    }

    @Override
    public void mostrar() {
        System.out.println("Tipo de Mueble: " + this.getClass().getSimpleName());
        super.mostrar();
    }
}
