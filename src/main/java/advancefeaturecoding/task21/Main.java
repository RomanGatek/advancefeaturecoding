package advancefeaturecoding.task21;

public class Main {
    public static void main(String[] args) {
        Shape3D cone = new Cone(3, 5);
        Shape3D qube = new Qube(4);

        cone.displayInfo();
        System.out.println();

        qube.displayInfo();
    }
}
