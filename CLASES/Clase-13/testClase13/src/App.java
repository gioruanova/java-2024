import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        Integer[] numbers = { 11, 222, 333, 46, 5, 6, 7000, 8, -9, 1010, 11 };

        // System.out.println(numbers.length);
        // System.out.println(numbers[10 - 1]);

        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));
        // Arrays.sort(numbers, Collections.reverseOrder());
        // System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        // [-9, 5, 6, 8, 11, 46, 222, 333, 1010, 7000, 11]
        System.out.println(numbers.length);

        // Arrays.fill(numbers, 333);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 333));

        Integer[] copiaFiel = Arrays.copyOf(numbers, 15);
        System.out.println(Arrays.toString(copiaFiel));
        Integer[] copiaFielUno = Arrays.copyOfRange(copiaFiel,5, copiaFiel.length);

        System.out.println(Arrays.toString(copiaFielUno));

        /*
         * Repaso de herencia
         */
        
        // Animal p = new Perro();
        // Perro p = new Animal();


    }
}
