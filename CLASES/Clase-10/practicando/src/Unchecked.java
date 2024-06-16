public class Unchecked {

    public static void main(String[] args) throws ExcepcionCustomizada {

        final String MSG = "Hola mundo";

        // String texto = "abc";
        // int numero = Integer.parseInt(texto);

        // String algo = null;

        // if (algo.length() > 10) {
        // System.out.println("Avisar a RRHH: " + MSG);
        // }

        String userName = null;

        // if (userName != null) {
        // System.out.println(".... hago algo.");
        // }

        // if (userName == null || userName.isEmpty()) {
        // System.out.println("Controlo la excepcion... ");
        // System.out.println(".... hago algo.");
        // }

        try {
            if (userName == null) {
                throw new ExcepcionCustomizada("excepcion customizada");
            }
        } catch (Exception e) {
            System.out.println("msg: " + e.getMessage());
        }

    }

}
