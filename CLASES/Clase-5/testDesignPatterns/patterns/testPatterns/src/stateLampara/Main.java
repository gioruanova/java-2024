package stateLampara;

public class Main {

    public static void main(String[] args) {
        Lampara lampara = new Lampara();

        System.out.println("Soy una : " + lampara.getClass().getSimpleName());

        /*
         * switch clickea "ON"
         */
        lampara.encender();
        lampara.apagar();
        lampara.encender();

        /*
         * PLUS AGREGAMOS VALIDACION
         * DE SI YA ESTA ENCENDIDA
         */

        lampara.encender();

        System.out.println("Sigo siendo una : " + lampara.getClass().getSimpleName());

    }

}
