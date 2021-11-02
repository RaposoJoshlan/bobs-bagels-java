package com.bob.bagels;

public class Fill_Basket {
    private boolean isFull;
    private String message;
    private boolean isAdded;

    public Fill_Basket(boolean isFull, String message, boolean isAdded) {
        this.isFull = isFull;
        this.message = message;
        this.isAdded = isAdded;
    }

    public boolean isFull() {
        return isFull;
    }

    public String getMessage() {
        return message;
    }

    public boolean isAdded() {
        return isAdded;
    }
}
