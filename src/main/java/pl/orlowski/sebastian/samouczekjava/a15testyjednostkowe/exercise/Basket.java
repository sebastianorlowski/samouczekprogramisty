package pl.orlowski.sebastian.samouczekjava.a15testyjednostkowe.exercise;

import java.util.HashMap;
import java.util.Map;

public class Basket implements BasketInterface {
    Item item;
    Map<Item, Integer> orderedItems = new HashMap<Item, Integer>();

    //Dodawanie przedmiotu nazwa, cena + ilosc
    public void addItem(Item item, int count) {
        if(count <= 0) {
            throw new IllegalArgumentException("Count of products cannot be equals 0 or less!");
        }
        this.item = item;
        orderedItems.put(item, count);
    }

    // Usuwanie przedmiotu z nazwa i ilością
    public void removeItem(Item item, int count) {
        if(count <= 0) {
            throw new IllegalArgumentException("There is nothing to remove");
        }
        count = orderedItems.get(item) - count;
        if(count == 0) {
            orderedItems.remove(item);
        }
        else if(count < 0) {
            throw new IllegalArgumentException("There is not enough products to remove!");
        }
        else {
            orderedItems.put(item, count);
        }
    }

    public Double total() {
    double total = 0;
        for(Map.Entry<Item, Integer> itemOrder : orderedItems.entrySet() ) {
            total += itemOrder.getKey().getPrice() * itemOrder.getValue();
        }
        return total;
    }

    public void returnBasket() {
        for(Map.Entry<Item, Integer> itemOrder : orderedItems.entrySet()) {
            Item item = itemOrder.getKey();
            Integer count = itemOrder.getValue();
            System.out.println("Product: " + item + " Ilosc: " + count);
        }
    }
}
