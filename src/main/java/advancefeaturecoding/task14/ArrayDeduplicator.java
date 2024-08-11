package advancefeaturecoding.task14;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayDeduplicator {

    public static int[] deduplicateItems(int[] array, int maxValue) {
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
