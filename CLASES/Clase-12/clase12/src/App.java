import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Alex", 20);
        Persona p2 = new Persona("David", 31);
        Persona p3 = new Persona("Carlos", 25);
        Persona p4 = new Persona("Beatriz", 37);

        ListaGenerica<Persona> personas = new ListaGenerica<>();
        personas.agregar(p1);
        personas.agregar(p2);
        personas.agregar(p3);
        personas.agregar(p4);

        System.out.print("\n");
        System.out.println(" ************************************  " + "\n");
        System.out.println("Ordenamos de menor a mayor por nombres: ");
        personas.ordenarDeMenorAMayor();
        personas.mostrar();

        System.out.print("\n");
        System.out.println(" ************************************  " + "\n");

        System.out.println("Ordenamos de mayor a menor por nombres: ");
        personas.ordenarDeMayorAMenor();
        personas.mostrar();

        System.out.print("\n");
        System.out.println(" ************************************  " + "\n");

        System.out.println("Ordenamos de menor a mayor por edades: ");
        personas.ordenarPorEdadMenorMayor();
        personas.mostrar();

        System.out.print("\n");
        System.out.println(" ************************************  " + "\n");

        System.out.println("Ordenamos de mayor a menor por edades: ");
        personas.ordenarPorEdadMayorMenor();
        personas.mostrar();

        // System.out.println("Despues de Ordenar: ");
        // personas.forEach(x -> System.out.println(x.toString()));

        System.out.print("\n");
        System.out.println(" ************************************  " + "\n");

        ListaGenerica<Integer> misNumeros = new ListaGenerica<>();
        misNumeros.agregar(11);
        misNumeros.agregar(4);
        misNumeros.agregar(22);

        System.out.println("De menor a mayor: ");
        misNumeros.ordenarDeMenorAMayor();
        misNumeros.mostrar();
        System.out.println(" ");
        System.out.println("De mayor a menor: ");
        misNumeros.ordenarDeMayorAMenor();
        misNumeros.mostrar();

    }
}
