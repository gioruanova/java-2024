package singleton;

public class Main {

    public static void main(String[] args) {

        // Singleton singleton = Singleton.getInstance();
        // Singleton anotherSingleton = Singleton.getInstance();

        // System.out.println("Antes: " + singleton.hashCode());
        // System.out.println("Despues: " + singleton.hashCode());

        Duenio d1 = new Duenio("Jhon", "Doe");
        Duenio d2 = new Duenio("Jhon", "Doe");

        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));

        String p1 = "Hola";
        String p2 = "Hola";
        String p3 = new String("Hola");
        String p4 = p1;

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p4));

        Duenio d3 = d1;
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d1.equals(null));

    }

}
