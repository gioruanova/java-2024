package state;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * La clase contexto permanece constante
         * no cambia
         */
        Contexto context = new Contexto(new Feliz());
        System.out.println(context.getClass().getSimpleName());
        context.manejarEstado();
        context.manejarEstado();
        System.out.println(context.getClass().getSimpleName());
    }
}
