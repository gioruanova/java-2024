package strategy;

public class Main {
    public static void main(String[] args) {

        Contexto contexto = new Contexto(new EstrategiaAuto());

        contexto.elegirRuta();
        contexto.setEstrategia(new EstrategiaBicicleta());
        contexto.elegirRuta();
        contexto.setEstrategia(new EstrategiaTren());
        contexto.elegirRuta();
    }

}
