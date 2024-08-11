package advancefeaturecoding.task12;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Car {
    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearOfManufacture, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public boolean hasEngineType(EngineType type) {
     return this.engineType == type;
    }

    public boolean hasAtLeastOneManufacturer() {
        return this.manufacturers != null && !this.manufacturers.isEmpty();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 &&
                yearOfManufacture == car.yearOfManufacture &&
                Objects.equals(name, car.name) &&
                Objects.equals(model, car.model) &&
                Objects.equals(manufacturers, car.manufacturers) &&
                engineType == car.engineType;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturers, engineType);
    }

    @Override
    public String toString() {
        String manufacturersString = manufacturers.stream()
                .map(Manufacturer::toString)
                .collect(Collectors.joining(","));

        return String.format(
                "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}',
                name, model, price, yearOfManufacture, manufacturersString, engineType
        );
    }
}