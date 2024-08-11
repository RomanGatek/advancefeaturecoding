package advancefeaturecoding.task23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {
    private Map<String, Integer> animalsMap;

    public Zoo() {
        this.animalsMap = new HashMap<>();
    }

    public Zoo(Map<String, Integer> animalsMap) {
        this.animalsMap = animalsMap;
    }

    public int getNumberOfAllAnimals() {
        return animalsMap.values().stream().mapToInt(Integer::intValue).sum();
    }

    public Map<String, Integer> getAnimalsCount() {
        return new HashMap<>(animalsMap);
    }


    public Map<String, Integer> getAnimalsCountSorted() {
        return animalsMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public void addAnimals(String species, int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number of animals to add must be positive.");
        }
        animalsMap.put(species, animalsMap.getOrDefault(species, 0) + number);
    }
}
