package advancefeaturecoding.task4;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        addValues(storage);

        printValuesForKey(storage, "car");
        printValuesForKey(storage, "bike");

        findKeysForValue(storage, "Skoda");
        findKeysForValue(storage, "Volkswagen");
        findKeysForValue(storage, "Olpran");

    }

    private static void addValues(Storage storage) {
        storage.addToStorage("car", "Skoda");
        storage.addToStorage("car", "Peugeot");
        storage.addToStorage("bike", "Olpran");
        storage.addToStorage("bike", "Colnago");
        storage.addToStorage("car", "Volkswagen");

    }

    private static void printValuesForKey(Storage storage, String key) {
        System.out.println("----------------------------------");
        System.out.println("Values for key '" + key + "':");
        storage.printValues(key);
    }

    private static void findKeysForValue(Storage storage, String value) {
        System.out.println("----------------------------------");
        System.out.println("Values for key '" + value + "':");
        storage.findValues(value);
    }

}


