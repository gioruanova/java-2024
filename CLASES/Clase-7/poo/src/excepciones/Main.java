package excepciones;

public class Main {

    public static void main(String[] args) {

        int a = 2;
        int b = 0;

        /*
        Intro a excepciones
         */

        try {
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            System.out.println(a / b);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("..... continuo..");

    }

}
