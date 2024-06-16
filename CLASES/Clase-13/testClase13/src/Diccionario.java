import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Diccionario {

    public static void main(String[] args) {

        // Map<K,V> nombre = new HashMap<K,V>();
        Map<Integer, String> diccionario = new HashMap<Integer, String>();

        diccionario.put(100, "Fernando");
        diccionario.put(11, "Fernando");
        diccionario.put(2, "Denise");
        diccionario.put(3, "Jorge");
        diccionario.put(4, "Facundo");
        diccionario.put(44, "Facundo");
        // diccionario.put(4, "Maricel");

        // System.out.println(diccionario.size());

        // System.out.println(diccionario.get(2));

        // System.out.println(diccionario.containsKey(4));
        // System.out.println(diccionario.containsValue("Facundo"));

        // System.out.println(diccionario.keySet());
        // System.out.println(diccionario.values());
        System.out.println(diccionario.entrySet());

        // System.out.println(diccionario.remove(4));

        // diccionario.values().stream().forEach(System.out::println);

        Map<Persona, String> mapaPersonas = new HashMap<>();

        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("Juan", 30);

        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());

        mapaPersonas.put(persona2, "Información de Juan duplicada");
        mapaPersonas.put(persona1, "Información de Juan");

        // Iterar sobre el HashMap
        // for (Map.Entry<Persona, String> entry : mapaPersonas.entrySet()) {
        // System.out.println(entry.getKey() + " - " + entry.getValue());
        // }

        // mapaPersonas.entrySet().stream().forEach(System.out::println);

        // personas.values().stream().forEach(System.out::println);

        // for (Map.Entry<Integer, Persona> entry : personas.entrySet()) {
        // System.out.println(entry.getValue().toString());
        // }

        // TreeMap<String, Integer> treeMap = new TreeMap<>();

        // // Agregamos algunos elementos al TreeMap
        // treeMap.put("g", 1);
        // treeMap.put("z", 2);
        // treeMap.put("f", 4);
        // treeMap.put("y", 6);

        // // Buscamos la entrada mapeada con la clave más pequeña que es mayor que "c"
        // Map.Entry<String, Integer> higherEntry = treeMap.lowerEntry("h");

        // // Imprimimos la entrada mapeada encontrada
        // if (higherEntry != null) {
        // System.out.println("La clave más pequeña mayor que 'z' es: " +
        // higherEntry.getKey() + " con valor: "
        // + higherEntry.getValue());
        // } else {
        // System.out.println("No hay ninguna clave más pequeña mayor que 'c' en el
        // TreeMap.");
        // }

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", 1);
        linkedHashMap.put("b", 2);

        int valorA = linkedHashMap.getOrDefault("a", 1); // Devuelve 1
        int valorC = linkedHashMap.getOrDefault("c", 0); // Devuelve 0

        System.out.println("Valor de 'a': " + valorA);
        System.out.println("Valor de 'c': " + valorC);

        linkedHashMap.replace("a", 1, 2); // Reemplaza 'a' con valor 1 por 2
        linkedHashMap.replace("b", 2, 44); // No hace nada, 'b' no está presente

        System.out.println(linkedHashMap); // Imprime: {a=2}

        LinkedHashMap<String, Integer> linkedHashMapClone = (LinkedHashMap<String, Integer>) linkedHashMap.clone();

        linkedHashMapClone.put("d", 33);

        System.out.println(linkedHashMapClone);
    }

}
