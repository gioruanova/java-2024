package strategy;

public class EstrategiaAuto implements EstrategiaTransporte {

    @Override
    public void elegirRuta() {
        System.out.println("Tomando la ruta terrestre más rapida");
    }

}
