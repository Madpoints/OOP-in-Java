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
        SaloonCar saloonCar1 = new SaloonCar(2);
        SaloonCar saloonCar2 = new SaloonCar("Nissan", 3);
        SaloonCar saloonCar3 = new SaloonCar("purple", "Ford", 4);

    }
}

