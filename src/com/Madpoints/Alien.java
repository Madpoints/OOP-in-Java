package com.Madpoints;

public class Alien extends ObjectMoveAndColor {
    private String planet;

    public Alien(boolean move, String color, String planet) {
        super(move, color);
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }
}
