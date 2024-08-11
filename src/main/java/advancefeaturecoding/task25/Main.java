package advancefeaturecoding.task25;


public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        try {
            for (int i = 0; i < 12; i++) {
                try {
                    basket.addToBasket();
                    System.out.println("Added item. Current count: " + basket.getItemCount());
                } catch (BasketFullException e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            for (int i = 0; i < 12; i++) {
                try {
                    basket.removeFromBasket();
                    System.out.println("Removed item. Current count: " + basket.getItemCount());
                } catch (BasketEmptyException e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
        } catch (
                Exception e) {

            e.printStackTrace();
        }
    }
}