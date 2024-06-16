import util.Lector;
import util.Libro;
import util.LibroFisico;

public class App {

    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static class LibroElectronico extends Libro {

        public int duracionBateria;
        /*
         * Gracias al protected puedo utilizar la
         * variable "variableClasePadre"
         */
        public String variable = variableClasePadre;

        public LibroElectronico(String nombre, String autor, Integer anioEdicion, int duracionBateria) {
            super(nombre, autor, anioEdicion);
            this.duracionBateria = duracionBateria;
        }

        public int getDuracionBateria() {
            return duracionBateria;
        }

        public void mostrarNombreSuperClase() {
            System.out.println(super.nombre);
        }

        public void variableClasePadre() {
            System.out.println(variable);
        }

    }

    public static class VariablesPrimitivas {

        static void mostrarMsg() {
            System.out.println("Mensaje de la class \"VariablesPrimitivas\" ");
        }

        int numero = 10;
        String palabra = "Test Scope";

    }

    public static void main(String[] args) throws Exception {

        /*
         * Analizamos equals, metodo heredado de Object
         */
        Object o = new Object();

        VariablesPrimitivas v = new VariablesPrimitivas();
        VariablesPrimitivas v1 = new VariablesPrimitivas();

        System.out.println(v.equals(v1));

        System.out.println(v.numero);
        System.out.println(v.palabra);

        Libro nuevoLibro = new LibroFisico("Libro de cocina integral", "Rober C", 2022, 450);

        /*
         * Casteo para recuperar la clase "LibroFisico"
         */
        LibroFisico lf = (LibroFisico) nuevoLibro;

        System.out.println(nuevoLibro.autor);
        System.out.println(lf.cantidadPaginas);

        /*
         * Modificacion de un atributo publico
         */
        lf.cantidadPaginas = 1400;

        System.out.println(lf.cantidadPaginas);

        int numero = 22;

        Libro nuevoLibroElectronicLibro = new LibroElectronico("Libro de cocina integral V2", "Rober C v2",
                2022, 450);

        LibroElectronico le = (LibroElectronico) nuevoLibroElectronicLibro;

        System.out.println(nuevoLibroElectronicLibro.nombre);
        le.variableClasePadre();
        le.getAnioEdicion();
        System.out.println(le.duracionBateria);

        VariablesPrimitivas.mostrarMsg();
        App.staticMethod();

    }
}
