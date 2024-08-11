package advancefeaturecoding.task7;

public class Magazine {
    private String[] bullets;
    private int capacity;
    private int count;

    public Magazine(int size) {
        this.capacity = size;
        this.bullets = new String[size];
        this.count = 0;
    }

    public void loadBullet(String bullet) {
        if (count < capacity) {
            bullets[count++] = bullet;
        } else {
            System.out.println("Magazine is full.");
        }
    }

    public boolean isLoaded() {
        return count > 0;
    }

    public void shot() {
        if (count > 0) {
            System.out.println(bullets[--count]);
        } else {
            System.out.println("Empty magazine.");
        }
    }
}