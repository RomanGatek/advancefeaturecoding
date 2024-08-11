package advancefeaturecoding.task9;

import advancefeaturecoding.task10.MoveDirection;

import java.util.List;

public class Main {

    private static final String RESET = "\033[0m";
    private static final String RED = "\033[0;31m";
    private static final String GREEN = "\033[0;32m";
    private static final String YELLOW = "\033[0;33m";
    private static final String BLUE = "\033[0;34m";
    private static final String MAGENTA = "\033[0;35m";
    private static final String CYAN = "\033[0;36m";
    private static final String WHITE = "\033[0;37m";

    public static void main(String[] args) {

        Point2D center = new Point2D(0, 0);
        Point2D pointOnCircle = new Point2D(4, 6);
        Circle circle = new Circle(center, pointOnCircle);

        System.out.println(BLUE + "Initial Circle Information: " + RESET);
        printCircleInfo(circle);

        MoveDirection moveDirection = new MoveDirection(2,3);
        circle.move(moveDirection);

        System.out.println(YELLOW + "Updated Circle Information after moving:" + RESET);

        printCircleInfo(circle);

        resizeAndPrint(circle, 1.5);
        resizeAndPrint(circle, 0.5);
        resizeAndPrint(circle, 10.0);
    }

    private static void resizeAndPrint(Circle circle, double factor) {
        System.out.println(MAGENTA + "Resizing circle by factor " + factor + ":" + RESET);
        circle.resize(factor);
        printCircleInfo(circle);
    }

    private static void printCircleInfo(Circle circle) {

        System.out.println(CYAN + "Circle information: " + RESET);
        System.out.println(GREEN + "--------------------" + RESET);
        System.out.println("Center: " + circle.getCenter());
        System.out.println("Point on Circle: " + circle.getPointOnCircle());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Slice points: ");

        List<Point2D> slincePoints = circle.getSlicePoints();
        for (int i = 0; i < slincePoints.size(); i++) {
            System.out.println(" Point " + (i + 1) + ": " + slincePoints.get(i));

        }
        printSeparator();
    }
    private static void printSeparator() {
        System.out.println();
        System.out.println(GREEN + "--------------------" + RESET);
        System.out.println();
    }
}