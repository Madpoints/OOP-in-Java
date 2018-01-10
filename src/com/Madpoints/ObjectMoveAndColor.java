package com.Madpoints;

public class ObjectMoveAndColor {
    private boolean move;
    private String color;

    public ObjectMoveAndColor(boolean move, String color) {
        this.move = move;
        this.color = color;
    }

    public boolean isMove() {
        return move;
    }

    public String getColor() {
        return color;
    }
}
