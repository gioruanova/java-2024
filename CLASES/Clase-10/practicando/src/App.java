public class App {

    public static void main(String[] args) {

        // String[] textos = new String[3];
        // textos[0] = "Hola mundo";

        // try {
        // System.out.println(textos[10]);

        // } catch (RuntimeException a) {
        // // System.out.println("Error: " + a.getMessage());
        // throw new ExcepcionCustomizada("Soy una excepcion customizada...");
        // }

        // System.out.println("Continuo...");

        // try {
        // Persona p = new Persona("", "Perez");
        // } catch (RuntimeException e) {
        // e.printStackTrace();
        // }

        try {
            Persona p = new Persona(null, "Perez");
            System.out.println(p.getNombre());
        } catch (Exception e) {
            System.out.println("Error controlado de nullpointer: " + e.getMessage());
        }

        System.out.println("Continuo...");

    }

    public static void agregarPersonas(Persona p) {

    }

    public static void testExcepciones() throws NullPointerException, ArithmeticException, ExcepcionCustomizada {

    }

}
