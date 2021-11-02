package com.bob.bagels;

import java.util.UUID;

public class Item {
    private UUID itemId;

    public Item() {
        this.itemId = UUID.randomUUID();
    }

    public UUID getItemId() {
        return itemId;
    }
}
