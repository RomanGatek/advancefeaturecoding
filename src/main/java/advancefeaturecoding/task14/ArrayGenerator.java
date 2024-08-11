package advancefeaturecoding.task14;

import java.util.Random;

public class ArrayGenerator {
    public static int[] generateRandomArray(int size, int maxValue) {
        Random random = new Random();
        return random.ints(size, 0, maxValue).toArray();
    }
}