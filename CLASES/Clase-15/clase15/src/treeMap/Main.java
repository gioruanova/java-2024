package treeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.tree.TreeCellRenderer;

public class Main {

    public static void main(String[] args) {
        /*
         * Metodos de TreeMap
         */

         TreeMap<String, Long> tm = new TreeMap<>();
         HashMap<String, Long> hm = new HashMap<>();

        tm.put("Argentina", 60000000L);
        tm.put("Uruguay", 3000000L);
        tm.put("India", 1200000000L);
        tm.put("España", 70000000L);

        hm.put("a", 60000000L);
        hm.put("b", 3000000L);
        hm.put("e", 1200000000L);
        hm.put("d", 70000000L);

        hm.entrySet().stream().forEachOrdered(x -> System.out.println(x.getKey() + " - " + x.getValue()));

        System.out.println(tm.firstKey());
    }

}
