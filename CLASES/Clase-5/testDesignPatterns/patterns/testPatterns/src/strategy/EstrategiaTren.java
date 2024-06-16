package strategy;

public class EstrategiaTren implements EstrategiaTransporte {
    @Override
    public void elegirRuta() {
        System.out.println("Tomando la ruta más rápida por el ferrocarril norte.");
    }
}