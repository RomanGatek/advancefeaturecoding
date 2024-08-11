package advancefeaturecoding.task7;

public class Main {
    public static void main(String[] args) {
        Magazine mag = new Magazine(3);
        mag.loadBullet("Bullet 1");
        mag.loadBullet("Bullet 2");
        mag.loadBullet("Bullet 3");
        mag.loadBullet("Bullet 4");
        mag.loadBullet("Bullet 5");
        mag.loadBullet("Bullet 6");

        System.out.println(mag.isLoaded());

        mag.shot();
        mag.shot();
        mag.shot();
        mag.shot();
        mag.shot();
        mag.shot();

    }
}