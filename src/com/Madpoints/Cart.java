package com.Madpoints;

public class Cart extends ObjectMoveAndColor {
    private String model;

    public Cart(boolean move, String color, String model) {
        super(move, color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
