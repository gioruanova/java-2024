package strategy;

public class EstrategiaBicicleta implements EstrategiaTransporte {
    @Override
    public void elegirRuta() {
        System.out.println("Tomando la ruta más rápida por la bicisenda.");
    }
}