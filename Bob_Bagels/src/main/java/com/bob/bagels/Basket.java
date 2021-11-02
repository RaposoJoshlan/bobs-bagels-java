package com.bob.bagels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {

    private Item[] item = new Item[10];

    public boolean  addItemToBasket(Item newItem) {
        for (int i = 0, j = this.item.length; i<j; i++) {
            if(this.item[i] == null){
                this.item[i] = newItem;
                return true;
            }

        }
        return false;
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
                    return false;
                }
            }
        }
        return false;
    }
}