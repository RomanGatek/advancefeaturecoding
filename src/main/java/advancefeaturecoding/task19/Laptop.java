package advancefeaturecoding.task19;

import advancefeaturecoding.task18.Computer;

public class Laptop extends Computer {

    private int battery;

    public Laptop(String processor, int ram, String graphicCard, String company, String model, int battery) {
        super(processor, ram, graphicCard, company, model);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery = " + battery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery == laptop.battery;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + battery;
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Intel i7", 16, "NVIDIA GTX 1660", "Dell", "XPS 15", 85);
        Laptop laptop2 = new Laptop("AMD Ryzen 7", 32, "AMD Radeon RX 6800", "HP", "Omen 17", 75);
        Laptop laptop3 = new Laptop("Intel i7", 16, "NVIDIA GTX 1660", "Dell", "XPS 15", 85);

        System.out.println(laptop1);
        System.out.println(laptop2);


        System.out.println("laptop1.equals(laptop2): " + laptop1.equals(laptop2)); // false
        System.out.println("laptop1.equals(laptop3): " + laptop1.equals(laptop3)); // true
        System.out.println("laptop1.hashCode(): " + laptop1.hashCode());
        System.out.println("laptop3.hashCode(): " + laptop3.hashCode()); // should match laptop1's hashCode


        laptop1.setBattery(90);
        System.out.println("After modification:");
        System.out.println("laptop1.equals(laptop3): " + laptop1.equals(laptop3));
    }
}