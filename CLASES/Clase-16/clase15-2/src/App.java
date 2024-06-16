import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        Persona p1 = new Persona("Pedro", 33);
        Persona p2 = new Persona("Pedro", 33);

        System.out.println("Son iguales??: " + (p1.equals(p2) ? "SI" : "NO"));
        System.out.println("HashCode(): " + p1.hashCode());
        System.out.println("HashCode(): " + p2.hashCode());

        // p1 = p2;

        System.out.println("***************************");
        System.out.println("Son iguales??: " + (p1.equals(p2) ? "SI" : "NO"));

        System.out.println("HashCode(): " + p1.hashCode());
        System.out.println("HashCode(): " + p2.hashCode());
        Map<Persona, Integer> personas = new HashMap<>();

        personas.put(p2, 431);
        personas.put(p1, 20);

        System.out.println("Size: " + personas.size());

        personas.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " - " + x.getValue()));

    }
}
