package advancefeaturecoding.task12;


import advancefeaturecoding.task13.CarService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manufacturer bmw = new Manufacturer("BMW", 2016, "Germany");
        Manufacturer audi = new Manufacturer("Audi", 2020, "Germany");
        Manufacturer kia = new Manufacturer("Kia", 2023, "Slovakia");
        Manufacturer hyundai = new Manufacturer("Hyundai", 2020, "Czechia");
        Manufacturer skoda = new Manufacturer("Skoda", 2022, "Czechia");

        Car car1 = new Car("BMW X5", "xDrive40i", 65000, 2022, List.of(bmw), EngineType.V12);
        Car car2 = new Car("Audi Q7", "3.0 TDI", 58000, 2020, List.of(audi), EngineType.V6);
        Car car3 = new Car("Kia Sportage", "GT-Line", 35000, 2023, List.of(kia), EngineType.S4);
        Car car4 = new Car("Hyundai Tucson", "Ultimate", 30000, 2020, List.of(hyundai), EngineType.V6);
        Car car5 = new Car("Skoda Octavia", "RS", 45000, 2022, List.of(skoda), EngineType.V8);

        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);
        carService.addCar(car5);

        printCars("All cars: ", carService.getCars());
        printCars("Cars manufactured before 1999: ", carService.getCarsProducendBefore1999());
        printCar("The most expensive car: ", carService.getMostExpensiveCar());
        printCar("Cheapest car: ", carService.getCheapestCar());
        printCars("Cars with at least 3 manufacturers: ", carService.getCarWithLeast3Manufacturers());
        printCars("Cars sorted by price (ascending): ", carService.getSortedCars(true));
        printCars("Cars sorted by price (descending): ", carService.getSortedCars(false));
        printCars("Is the BMW X5 on the list?", carService.getCarsByManufacturer("BMW"));
        printCars("Cars from manufacturers established before 1920: ", carService.getCarsByManufacturerEstablismentYear("<", 1920));

    }

    private static void printCars(String title, List<Car> cars) {
        System.out.println(title);
        if (cars.isEmpty()) {
            System.out.println("No cars to display.");
        } else {
            cars.forEach(car -> {
                System.out.println(car);
                System.out.println("--------------------------");
            });
        }
        System.out.println();
    }

    private static void printCar(String title, Car car) {
        System.out.println(title);
        if (car == null) {
            System.out.println("No car to display.");
        } else {
            System.out.println(car);
        }
        System.out.println("--------------------------");
        System.out.println();
    }

    private static void printBoolean(String title, boolean value) {
        System.out.println(title + " " + (value ? "yes" : "no"));
        System.out.println("--------------------------");
        System.out.println();
    }
}