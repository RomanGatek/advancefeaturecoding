package advancefeaturecoding.task15;

public enum Car {
    FERRARI(250000, 700),
    PORSCHE(150000, 600),
    MERCEDES(120000, 550),
    BMW(90000, 500),
    OPEL(30000, 150),
    FIAT(20000, 100),
    TOYOTA(25000, 120);

    private final int price;
    private final int power;

    Car(int price, int power) {
        this.price = price;
        this.power = power;
    }

    public boolean isPremium() {
        return this.price > 100000;
    }

    public boolean isRegular() {
        return !isPremium();
    }

    public boolean isFasterThan(Car other) {
        if (other == null) {
            throw new IllegalArgumentException("Comparison car cannot be null");
        }
        return this.power > other.power;
    }

    @Override
    public String toString() {
        return this.name() + " (Price: $" + price + ", power: " + power + " HP)";
    }

    public static void main(String[] args) {

        for (Car car : Car.values()) {
            System.out.println(car);
        }
        Car ferrari = Car.FERRARI;
        Car toyota = Car.TOYOTA;
        System.out.println(ferrari.name() + " is premium: " + ferrari.isPremium());
        System.out.println(toyota.name() + " is premium: " + toyota.isPremium());

        Car opel = Car.OPEL;
        System.out.println(ferrari.name() + " is faster than " + opel.name() + ": " + ferrari.isFasterThan(opel));
    }

}