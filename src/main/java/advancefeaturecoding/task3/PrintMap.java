package advancefeaturecoding.task3;

import java.util.Map;

public class PrintMap {
    public static void printMap(Map<String, Integer> map) {
        int size = map.size();
        int count = 0;


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            count++;
            System.out.printf("Key: %s, Value: %d", entry.getKey(), entry.getValue());
            if (count < size) {
                System.out.println(", ");
            } else {
                System.out.println(".");
            }
        }
    }

}
