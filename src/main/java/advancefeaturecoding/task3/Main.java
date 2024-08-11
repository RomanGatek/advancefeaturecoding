package advancefeaturecoding.task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> exampleMap = new HashMap<>();
        exampleMap.put("Java", 18);
        exampleMap.put("Python", 1);
        exampleMap.put("C#", 4);
        exampleMap.put("C++", 9);
        exampleMap.put("PHP", 0);

        PrintMap.printMap(exampleMap);

    }
}
