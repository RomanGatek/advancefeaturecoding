package advancefeaturecoding.task24;

public class Basket {
    private static final int MAX_CAPACITY = 10;
    private int itemCount;

    public Basket() {
        this.itemCount = 0;
    }

    public Basket(int itemCount) {
        if (itemCount < 0 || itemCount > MAX_CAPACITY) {
            throw new IllegalArgumentException("Initial item count must be between 0 and " + MAX_CAPACITY);
        }
        this.itemCount = itemCount;
    }

    public void addToBasket() {
        if (itemCount >= MAX_CAPACITY) {
            throw new BasketFullException("Cannot add more items: basket is full.");
        }
        itemCount++;
    }

    public void removeFromBasket() {
        if (itemCount <= 0) {
            throw new BasketEmptyException("Cannot remove items: basket is empty.");
        }
        itemCount--;
    }

    public int getItemCount() {
        return itemCount;
    }

    public static int getMaxCapacity() {
        return MAX_CAPACITY;
    }


    @Override
    public String toString() {
        return "Basket [itemCount=" + itemCount + ", MAX_CAPACITY=" + MAX_CAPACITY + "]";
    }
}