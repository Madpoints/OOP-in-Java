package com.Madpoints;

public class Human extends ObjectMoveAndColor {
    private String name;

    public Human(boolean move, String color, String name) {
        super(move, color);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
