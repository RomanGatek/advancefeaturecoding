package advancefeaturecoding.task4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Storage {
    private Map<String, Set<String>> storageMap;

    public Storage() {
        storageMap = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        storageMap.computeIfAbsent(key, k -> new HashSet<>()).add(value);
    }

    public void printValues(String key) {
        Set<String> values = storageMap.get(key);
        if (values != null) {
            if (values.isEmpty()) {
                System.out.println("No values found: " + key);
            } else {
                for (String value : values) {
                    System.out.println(value);
                }
            }
        } else {
            System.out.println("No values found: " + key);
        }
    }

    public void findValues(String value) {
        boolean found = false;
        for (Map.Entry<String, Set<String>> entry : storageMap.entrySet()) {
            if (entry.getValue().contains(value)) {
                if (found) {
                    System.out.print(" ");
                }
                System.out.print(entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.print("No keys found:" + value);
        }
        System.out.println();
    }
}