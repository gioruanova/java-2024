import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGenerics {

    public static void main(String[] args) {

        /*
         * Metodo antiguo
         */
        List<String> listaPalabras = Arrays.asList("Hola", "Mundo");
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);

        superMetodoGeneric(listaNumeros);
        superMetodoGeneric(listaPalabras);

    }

    // public static void superMetodoGeneric(List<String> listaPalabras) {
    // listaPalabras.forEach(x -> System.out.println(x));
    // }

    // public static void superMetodoGenericNumeros(List<Integer> listaPalabras) {
    // listaPalabras.forEach(x -> System.out.println(x));
    // }

    /*
     * Metodo generico que nos ahorra repetir metodos
     */

    // public static <T> void superMetodoGeneric(List<T> e){
    // e.forEach(x -> System.out.println(x));
    // }

    public static <T> void superMetodoGeneric(List<T> e) {

        // List<T> listaFusion = new ArrayList<T>();

        // //Elementos e
        // for (T t : e) {
        //     listaFusion.add(t);
        // }

        // //Elementos e2
        // for (T t : e2) {
        //     listaFusion.add(t);
        // }

        // try {
        //     /*
        //      * 
        //      */
        //     for (T t : listaFusion) {
        //         if(t instanceof Lancha){

        //         }else if (t instanceof Kiwi){
                    
        //         }
        //     }
        // } catch (Exception z) {
        //     System.out.println(z.getMessage());
        // }
        e.forEach(x -> System.out.println(x));
    }

}
