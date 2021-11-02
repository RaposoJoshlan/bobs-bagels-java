package com.bob.bagels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {

    private Item[] item = new Item[10];
    private int basketCapacity = 0;

    public Basket() {}

    public Basket(int basketCapacity) {
        this.item = new Item[basketCapacity];
    }

    private Fill_Basket addItem(Item newItem) {
        for (int i = 0, j = this.item.length; i<j; i++) {
            if (checkForItemDuplicates(this.item[i], newItem)) {
                return new Fill_Basket(false, "Same Item cannot be added again", false);
            }
            if (this.item[i] == null) {
                this.item[i] = newItem;
                this.basketCapacity++;
                return new Fill_Basket(false, "Item added", true);
            }
        }
        return new Fill_Basket(false, "Err", false);
    }

     public Fill_Basket addItemToBasket(Item newItem) {
        if (this.basketCapacity == this.item.length) {
            return new Fill_Basket(true, "Basket Full", false);
        }

        return this.addItem(newItem);
    }

    public Item[] getItems() {
        return this.item;
    }

    public boolean removeItemFromBasket(Item removeItem) {
        for (int i = 0; i < this.item.length; i++) {
            for(int j =0; j < this.item.length; j ++ ) {
                try {
                    if (this.item[i].equals(removeItem)) {
                        List<Item> item = new ArrayList<>(Arrays.asList(this.item));
                        int removeIndex = item.indexOf(removeItem);
                        item.remove(removeIndex);
                        this.item = new Item[getItems().length - 1];
                        return true;
                    }
                } catch (NullPointerException nullPointerException) {
                    continue;
                }
            }
        }
        return false;
    }

    private boolean checkForItemDuplicates(Item itemsInBasket, Item currentItem) {
        try {
            return itemsInBasket.equals(currentItem);
        } catch (NullPointerException nullPointerException) {
            return false;
        }
    }
}