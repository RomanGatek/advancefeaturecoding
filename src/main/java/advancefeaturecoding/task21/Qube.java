package advancefeaturecoding.task21;

import advancefeaturecoding.task22.Fillable;

public class Qube extends Shape3D implements Fillable {
    private double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public void fill(int volume) {
        double volumeInLiters = volume;

        double shapeVolume = calculateVolume();

        if (volume > shapeVolume) {
            System.out.println("Overflow: The volume of water exceeds the capacity of the cube.");
        } else if (volume == shapeVolume) {
            System.out.println("Just right: The cube is filled to the brim.");
        } else {
            System.out.println("Not enough: The cube is not filled to the brim.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Qube: ");
        super.displayInfo();
        System.out.println("Side: " + side);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Volume: " + calculateVolume());
    }

    @Override
    public String toString() {
        return "Qube{" +
                "side=" + side +
                ", calculatePerimeter=" + calculatePerimeter() +
                ", calculateArea=" + calculateArea() +
                ", calculateVolume=" + calculateVolume() +
                '}';
    }
}
