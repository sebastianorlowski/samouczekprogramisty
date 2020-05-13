package pl.orlowski.sebastian.samouczekjava.a15testyjednostkowe.exercise;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BasketTest {
    private Item item;
    private Item trousers;
    private Basket basket;
    private double total;


    @Before
    public void setUp() {
        item = new Item("t-shirt", 99.99);
        trousers = new Item("trousers", 109.99);
        basket = new Basket();
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionIfCountNull() {
        basket.addItem(item, 0);
    }

    @Test
    public void checkIfIWantAddProduct() {
        basket.addItem(item, 200);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionIfCountIsLessThanZero() {
        basket.addItem(item, -20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionIfRemoveFromEmptyBasket() {
        basket.removeItem(item, 0);
    }

    @Test
    public void returnTotalValueIfIsOneProduct() {
        basket.addItem(item, 1);
        total = basket.total();
        assertEquals(99.99, total, 0.01);
    }

    @Test
    public void returnTotalValueIfIsFewProducts() {
        basket.addItem(item, 3);
        basket.addItem(trousers, 1);
        total = basket.total();
        assertEquals(409.96, total, 0.01);
    }

    @Test
    public void returnWrongTotalValueIfIsFewProducts() {
        basket.addItem(item, 2);
        total = basket.total();
        assertNotEquals(199.99, total);
    }

}