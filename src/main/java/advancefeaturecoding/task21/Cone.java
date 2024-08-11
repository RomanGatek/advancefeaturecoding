package advancefeaturecoding.task21;

import advancefeaturecoding.task22.Fillable;

public class Cone extends Shape3D implements Fillable {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public void fill(int volume) {
        double volumeInFilters = volume;
        double shapeVolume = calculateVolume();

        if (volume > shapeVolume) {
            System.out.println("Overflow: The volume of water exceeds the capacity of the cone.");
        } else if (volume == shapeVolume) {
            System.out.println("Just right: The cone is filled to the brim.");
        } else {
            System.out.println("Not enough: The cone is not filled to the brim.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Cone: ");
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Volume: " + calculateVolume());
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                ", calculatePerimeter=" + calculatePerimeter() +
                ", calculateArea=" + calculateArea() +
                ", calculateVolume=" + calculateVolume() +
                '}';
    }
}