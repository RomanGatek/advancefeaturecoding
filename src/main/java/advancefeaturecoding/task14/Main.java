package advancefeaturecoding.task14;

import java.util.List;
import java.util.Map;

public class Main {

    private static final int ARRAY_SIZE = 100000;
    private static final int MAX_VALUE = 1000000; // Adjust range if needed

    public static void main(String[] args) {
        int[] array = ArrayGenerator.generateRandomArray(ARRAY_SIZE, MAX_VALUE);

        List<Integer> uniqueItems = ArrayAnalyzer.getUniqueItems(array);
        System.out.println("Unique items count: " + uniqueItems.size());


        List<Integer> repeatedItems = ArrayAnalyzer.getRepeatedItems(array);
        System.out.println("Repeated items count: " + repeatedItems.size());


        List<Map.Entry<Integer, Integer>> top25FrequentItems = ArrayAnalyzer.getTop25FrequentItems(array);
        System.out.println("Top 25 frequent items: ");
        top25FrequentItems.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


        int[] deduplicatedArray = ArrayDeduplicator.deduplicateItems(array, MAX_VALUE);
        List<Integer> deduplicatedRepeatedItems = ArrayAnalyzer.getRepeatedItems(deduplicatedArray);
        System.out.println("Repeated items count after deduplication: " + deduplicatedRepeatedItems.size());
    }
}