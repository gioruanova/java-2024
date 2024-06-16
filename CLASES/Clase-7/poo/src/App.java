import java.util.Scanner;

import interfaces.InterfazA;
import interfaces.InterfazC;

public class App {

    public static class Test implements InterfazC {

        @Override
        public void metodoA() {
            System.out.println("Metodo A");
        }

        @Override
        public void metodoB() {
            System.out.println("Metodo B");
        }

        @Override
        public void metodoC() {
            System.out.println("Metodo C");
        }

    }

    public static void main(String[] args) throws Exception {

        Test t = new Test();

        t.metodoA();
        t.metodoB();
        t.metodoC();

    }
}
