package advancefeaturecoding.task24;


public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        try {
            for (int i = 0; i < 12; i++) {
                basket.addToBasket();
                System.out.println("Added item. Current count: " + basket.getItemCount());
            }
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }

        try {

            for (int i = 0; i < 12; i++) {
                basket.removeFromBasket();
                System.out.println("Removed item. Current count: " + basket.getItemCount());
            }
        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
