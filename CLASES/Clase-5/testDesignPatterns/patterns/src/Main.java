package designPatterns;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        // System.out.println(singleton.value);
        // System.out.println(anotherSingleton.value);

        Duenio d1 = new Duenio("Jhon", "Doe");
        Duenio d2 = new Duenio("Jhon", "Doe");

        Duenio d3 = d1;
        System.out.println(d1.equals(d1));
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));

        System.out.println(d1.hashCode());
    }

}
