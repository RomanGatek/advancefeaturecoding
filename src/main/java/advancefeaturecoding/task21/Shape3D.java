package advancefeaturecoding.task21;

import advancefeaturecoding.task20.Shape;

public abstract class Shape3D extends Shape {

    public abstract double calculateVolume();

    @Override
    public void displayInfo() {

        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Volume: " + calculateVolume());
    }
}