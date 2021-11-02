package com.bob.bagels;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Item item = new Item();
        basket.addItemToBasket(item);
        basket.removeItemFromBasket(item);
        System.out.println(basket.getItems().length);

    }
}
