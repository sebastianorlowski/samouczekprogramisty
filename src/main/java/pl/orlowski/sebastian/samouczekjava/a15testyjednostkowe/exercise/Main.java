package pl.orlowski.sebastian.samouczekjava.a15testyjednostkowe.exercise;

public class Main {

    public static void main(String[] args) {
    BasketInterface basket = new Basket();
    Item item1 = new Item("T-shirt", 49.99);
    Item item2 = new Item("Trousers", 109.99);
    basket.addItem(item1, 2);
    basket.addItem(item2, 1);
        System.out.println(basket.total());
        basket.returnBasket();

        basket.removeItem(item1, 1);
        System.out.println(basket.total());
        basket.returnBasket();
    }
}
