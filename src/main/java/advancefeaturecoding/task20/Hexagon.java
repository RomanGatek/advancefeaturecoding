package advancefeaturecoding.task20;

public class Hexagon extends Shape{
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * side;
    }

    public double calculateArea() {
        return (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "side=" + side +
                ", calculatePerimeter=" + calculatePerimeter() +
                ", calculateArea=" + calculateArea() +
                '}';
    }
}