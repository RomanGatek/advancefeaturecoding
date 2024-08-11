package advancefeaturecoding.task14;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayProcessor {

    private static final int ARRAY_SIZE = 100000;
    private static final int MAX_VALUE = 1000000; // Adjust range if needed

    public static void main(String[] args) {
        // Generate the random array
        int[] array = generateRandomArray(ARRAY_SIZE, MAX_VALUE);

        // 1. Return a list of unique items
        List<Integer> uniqueItems = getUniqueItems(array);
        System.out.println("Unique items count: " + uniqueItems.size());

        // 2. Return a list of repeated items
        List<Integer> repeatedItems = getRepeatedItems(array);
        System.out.println("Repeated items count: " + repeatedItems.size());

        // 3. Return a list of the 25 most frequently recurring items
        List<Map.Entry<Integer, Integer>> top25FrequentItems = getTop25FrequentItems(array);
        System.out.println("Top 25 frequent items: ");
        top25FrequentItems.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        // 4. Deduplicate items
        int[] deduplicatedArray = deduplicateItems(array, MAX_VALUE);
        List<Integer> deduplicatedRepeatedItems = getRepeatedItems(deduplicatedArray);
        System.out.println("Repeated items count after deduplication: " + deduplicatedRepeatedItems.size());
    }

    private static int[] generateRandomArray(int size, int maxValue) {
        Random random = new Random();
        return random.ints(size, 0, maxValue).toArray();
    }

    private static List<Integer> getUniqueItems(int[] array) {
        return Arrays.stream(array).distinct().boxed().collect(Collectors.toList());
    }

    private static List<Integer> getRepeatedItems(int[] array) {
        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private static List<Map.Entry<Integer, Integer>> getTop25FrequentItems(int[] array) {
        Map<Integer, Integer> frequencyMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.summingInt(e -> 1)));

        return frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(25)
                .collect(Collectors.toList());
    }

    private static int[] deduplicateItems(int[] array, int maxValue) {
        Set<Integer> existingItems = Arrays.stream(array).boxed().collect(Collectors.toSet());
        Random random = new Random();
        int[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < newArray.length; i++) {
            while (existingItems.contains(newArray[i])) {
                int newValue = random.nextInt(maxValue);
                if (!existingItems.contains(newValue)) {
                    existingItems.remove(newArray[i]);
                    existingItems.add(newValue);
                    newArray[i] = newValue;
                }
            }
        }

        return newArray;
    }
}