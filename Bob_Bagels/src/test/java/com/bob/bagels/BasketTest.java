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
        boolean result = basket.addItemToBasket(item[0]);
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
}