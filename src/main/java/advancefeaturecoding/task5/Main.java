package advancefeaturecoding.task5;

public class Main {
    public static void main(String[] args) {
        SDAHashSet<String> set = new SDAHashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");

        System.out.println("Size: " + set.size());

        System.out.println("Contains A? " + set.contains("A"));
        System.out.println("Contains D? " + set.contains("D"));

        set.remove("B");
        System.out.println("Removal size B: " + set.size());

        set.clear();
        System.out.println("Clear size: " + set.size());
    }
}