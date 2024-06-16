package main;

import java.math.BigDecimal;

import clases.Alumno;
import clases.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Clase pŕactica General");

        // Persona p = new Persona("Fernando", "Valls", 33, 79);
        // Persona p1 = new Persona("Fernando", "Valls", 33, 79);
        // Alumno a = new Alumno();

        // p = a;
        // a = (Alumno) p;
        // System.out.println("Soy un: " + a.getClass().getName());

        // p = p1;
        // System.out.println(p.equals(p1));
        // // System.out.println(p.toString());
        // p.setPeso(80);
        // // System.out.println(p);

        // Integer valorA = 33;
        // Number valorB = valorA;
        // Integer valorC = 100;
        // valorB = valorC;

        double vd1 = 0.1;
        double vd2 = 0.7;
        double resultadoDouble = vd1 + vd2;
        System.out.println("Resultado Double: " + resultadoDouble);

        BigDecimal vbd1 = new BigDecimal("0.1");
        BigDecimal vbd2 = new BigDecimal("0.7");
        BigDecimal resultadoBigDecimal = vbd1.add(vbd2);
        String hola = "";
        System.out.println("Resuldado BigDecimal: " + resultadoBigDecimal);

    }
}
