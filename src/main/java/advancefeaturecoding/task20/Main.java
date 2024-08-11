package advancefeaturecoding.task20;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(3, 4, 5);
        Shape hexagon = new Hexagon(6);

        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(hexagon);
    }
}
