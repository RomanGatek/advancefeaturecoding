package advancefeaturecoding.task21;

public class Main {
    public static void main(String[] args) {
        Cone cone = new Cone(3, 5);
        Qube qube = new Qube(4);

        cone.displayInfo();
        System.out.println("--------------------------");
        System.out.println();

        qube.displayInfo();
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("Testing Cone:");
        cone.fill(150);
        cone.fill((int) cone.calculateVolume());
        cone.fill(50);
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("Testing Cube:");
        qube.fill(70);
        qube.fill((int) qube.calculateVolume());
        qube.fill(30);
        System.out.println("--------------------------");
        System.out.println();
    }
}
