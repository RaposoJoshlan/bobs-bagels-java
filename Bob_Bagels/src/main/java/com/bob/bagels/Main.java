package com.bob.bagels;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
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

        for(int i = 0, j = item.length; i < j; i++) {
            basket.addItemToBasket(item[i]);
        }
        //boolean result = basket.addItemToBasket(item[11]).isAdded();
        String g = basket.addItemToBasket(item[1]).getMessage();
        System.out.println(g);

    }
}
