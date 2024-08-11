package advancefeaturecoding.task23;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();


        zoo.addAnimals("Lion", 5);
        zoo.addAnimals("Tiger", 8);
        zoo.addAnimals("Bear", 3);
        zoo.addAnimals("Elephant", 2);
        zoo.addAnimals("Giraffe", 4);
        zoo.addAnimals("Zebra", 7);
        zoo.addAnimals("Kangaroo", 9);
        zoo.addAnimals("Panda", 3);
        zoo.addAnimals("Polar Bear", 7);
        zoo.addAnimals("Gorilla", 6);
        zoo.addAnimals("Penguin", 6);


        System.out.println("Total number of animals: " + zoo.getNumberOfAllAnimals());
        System.out.println("Animals count by species: " + zoo.getAnimalsCount());
        System.out.println("Sorted animal count by species: " + zoo.getAnimalsCountSorted());
    }
}
