package advancefeaturecoding.task14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayAnalyzer {

    public static List<Integer> getUniqueItems(int[] array) {
        return Arrays.stream(array)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> getRepeatedItems(int[] array) {
        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<Map.Entry<Integer, Integer>> getTop25FrequentItems(int[] array) {
        Map<Integer, Integer> frequencyMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.summingInt(e -> 1)));

        return frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(25)
                .collect(Collectors.toList());

    }
}