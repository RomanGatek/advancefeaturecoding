package advancefeaturecoding.task6;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPrinter {
    public static <K, V> void printFirstLastEntry(TreeMap<K,V> map) {
        if (map == null || map.isEmpty()) {
            System.out.println("The TreeMap is null or empty.");
            return;
        }

        Map.Entry<K, V> firstEntry = map.firstEntry();
        Map.Entry<K, V> lastEntry = map.lastEntry();

        System.out.println("First Entry: " + firstEntry);
        System.out.println("Last Entry: " + lastEntry);

    }
}
