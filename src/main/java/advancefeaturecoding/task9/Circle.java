package advancefeaturecoding.task9;

import advancefeaturecoding.task10.Movable;
import advancefeaturecoding.task10.MoveDirection;
import advancefeaturecoding.task11.Resizable;

import java.util.ArrayList;
import java.util.List;

class Circle implements Movable, Resizable {
    private Point2D center;
    private Point2D pointOnCircle;
    private double radius;

    public Circle(Point2D center, Point2D pointOnCircle) {
        this.center = center;
        this.pointOnCircle = pointOnCircle;
        this.radius = calculateRadius();
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Point2D getPointOnCircle() {
        return pointOnCircle;
    }

    public void setPointOnCircle(Point2D pointOnCircle) {
        this.pointOnCircle = pointOnCircle;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double calculateRadius() {
        return Math.sqrt(Math.pow(center.getX() - pointOnCircle.getX(), 2) + Math.pow(center.getY() - pointOnCircle.getY(), 2));

    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public List<Point2D> getSlicePoints() {
        List<Point2D> points = new ArrayList<>();
        double angleIncrement = Math.PI / 2;

        double angle = Math.atan2(pointOnCircle.getY() - center.getY(), pointOnCircle.getX() - center.getX());

        for (int i = 1; i <= 3; i++) {
            double newAngle = angle + i * angleIncrement;
            double x = center.getX() + radius * Math.cos(newAngle);
            double y = center.getY() + radius * Math.sin(newAngle);
            points.add(new Point2D(x, y));

        }
        return points;
    }

    public void move(MoveDirection moveDirection) {
    center.move(moveDirection);
    pointOnCircle.move(moveDirection);
    this.radius = calculateRadius();
    }

    @Override
    public void resize(double resizeFactor) {
        if (resizeFactor <= 0) {
            throw new IllegalArgumentException("Resize factor must be positive.");
        }
        this.radius *= resizeFactor;

        double angle = Math.atan2(pointOnCircle.getY() - center.getY(), pointOnCircle.getX() - center.getX());
        pointOnCircle = new Point2D(center.getX() + radius * Math.cos(angle), center.getY() + radius * Math.sin(angle));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", pointOnCircle=" + pointOnCircle +
                ", radius=" + radius +
                '}';
    }
}
