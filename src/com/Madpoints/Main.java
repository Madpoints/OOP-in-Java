package com.Madpoints;

class Bulldozer {
    public String color;
    public String size;

    public Bulldozer(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}

public class Main {

    public static void main(String[] args) {
        Man man = new Man(true, "tan","randy");
        Cart cart = new Cart(true, "red", "go");
        Alien alien = new Alien(true, "purple","kyros");

    }
}

