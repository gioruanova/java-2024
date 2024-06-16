public class TestAserciones {

    public static void main(String[] args) {

        // int edad = 30;

        // assert (edad <= 18) : "No eres mayor de edad";

        String nombre = null;

        assert nombre != null && !nombre.isEmpty() : "El nombre no puede ser nulo ni vacío";

        int tamanioDeNombre = nombre.length();

    }

}
