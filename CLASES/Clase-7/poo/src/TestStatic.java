public class TestStatic {

    public static class Contador {

        public static int contador = 0;

        public Contador() {
            contador++;
        }

    }

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c44 = new Contador();
        System.out.println("El número total de instancias creadas es: " + Contador.contador);

    }

}
