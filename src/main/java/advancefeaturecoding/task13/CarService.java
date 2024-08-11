package advancefeaturecoding.task13;

import advancefeaturecoding.task12.Car;
import advancefeaturecoding.task12.Manufacturer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class CarService {
    private List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public void addCar (Car car) {
        cars.add(car);
    }

    public void removeCar (Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsProducendBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);
    }

    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);
    }

    public List<Car> getCarWithLeast3Manufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >=3)
                .collect(Collectors.toList());
    }

    public List<Car> getSortedCars(boolean ascending) {
        return cars.stream()
                .sorted(Comparator.comparingDouble(Car::getPrice))
                .collect(Collectors.toList());

    }

    public boolean isCarInList(Car car) {
        return cars.contains(car);
    }
    public List<Car> getCarsByManufacturer(String manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().stream()
                .anyMatch(m -> m.getName().equals(manufacturer)))
        .collect(Collectors.toList());

    }

    public List<Car> getCarsByManufacturerEstablismentYear(String comparsion, int year) {
        if (!Arrays.asList("<", ">", "<=", ">=", "=", "!=").contains(comparsion)) {
            throw new IllegalArgumentException("Invalid comparison operator. Use '<', '>', '<=', '>=', '=', '!='.");
        }
    return cars.stream()
            .filter(car -> {
                for (Manufacturer m : car.getManufacturers()) {
                    switch(comparsion) {
                    case "<":
                        if (m.getYearOfEstablishment() < year) return true;
                        break;
                    case ">":
                        if (m.getYearOfEstablishment() > year) return true;
                        break;
                    case "<=":
                        if (m.getYearOfEstablishment() <= year) return true;
                        break;
                    case ">=":
                        if (m.getYearOfEstablishment() >= year) return true;
                        break;
                    case "=":
                        if (m.getYearOfEstablishment() == year) return true;
                        break;
                    case "!=":
                        if (m.getYearOfEstablishment() != year) return true;
                        break;
                }
            }
            return false;
    })
            .collect(Collectors.toList());
    }
}