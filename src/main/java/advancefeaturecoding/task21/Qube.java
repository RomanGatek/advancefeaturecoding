package advancefeaturecoding.task21;

public class Qube extends Shape3D{
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
    public void displayInfo() {
        System.out.println("Qube: ");
        super.displayInfo();
        System.out.println("Side: " + side);
    }
}
