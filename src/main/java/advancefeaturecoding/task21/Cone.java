package advancefeaturecoding.task21;

public class Cone extends Shape3D {
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
    public void displayInfo() {
        System.out.println("Cone: ");
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
    }
}