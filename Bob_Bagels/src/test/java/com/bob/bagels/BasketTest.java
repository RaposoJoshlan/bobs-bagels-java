package com.bob.bagels;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    Basket basket;
    Item[] item = {
            new Item(),
            new Item(),
            new Item(),
            new Item(),
            new Item(),
            new Item(),
            new Item(),
            new Item(),
            new Item(),
            new Item() };

    @BeforeEach
    void setUp() {
        basket = new Basket();
    }

    @AfterEach
    void tearDown() {
        item = null;
    }

    @Test
    void addItem() {
        basket.addItemToBasket(item[0]);
        assertEquals(item[0], basket.getItems()[0]);
    }

    @Test
    void addItemTest() {
        boolean result = basket.addItemToBasket(item[0]).isAdded();
        assertTrue(result);
    }

    @Test
    void removeItemFromBasket() {
        basket.addItemToBasket(item[0]);
        basket.removeItemFromBasket(item[0]);
        assertEquals(9, basket.getItems().length);
    }

    @Test
    void removeItemTest() {
        basket.addItemToBasket(item[0]);
        boolean result = basket.removeItemFromBasket(item[0]);
        assertTrue(result);
    }

    @Test
    void removeItemFromAnyPosition() {
        basket.addItemToBasket(item[0]);
        basket.addItemToBasket(item[1]);
        basket.addItemToBasket(item[2]);

        boolean result = basket.removeItemFromBasket(item[0]);
        assertTrue(result);
    }

    @Test
    void removeItemNotInTheBasket() {
        basket.addItemToBasket(item[0]);


        boolean result = basket.removeItemFromBasket(item[1]);
        assertFalse(result);
    }

    @Test
    void isBasketFull() {

        for(int i = 0, j = basket.getItems().length; i < j; i++) {
            basket.addItemToBasket(item[i]);
        }

        boolean result = basket.addItemToBasket(item[1]).isFull();
        assertTrue(result);
    }

    @Test
    void checkMessage() {
        String h = basket.addItemToBasket(item[0]).getMessage();
        assertEquals("Item added", h);
    }

    @Test
    void checkForDuplicateItemsMessage() {
        basket.addItemToBasket(item[0]).getMessage();
        String g = basket.addItemToBasket(item[0]).getMessage();
        assertEquals(g,basket.addItemToBasket(item[0]).getMessage());
    }

    @Test
    void increaseBasketCapacity() {
        int newCap = 20;
        basket = new Basket(newCap);
        assertEquals(newCap, basket.getItems().length);
    }

    @Test
    void notRemoveItemNotThereInBasket() {
        boolean result = basket.removeItemFromBasket(item[0]);
        assertFalse(result);

    }
}