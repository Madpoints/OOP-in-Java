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
	    Bulldozer dozer = new Bulldozer("red", "big");
        System.out.println(dozer.getColor());
        System.out.println(dozer.getSize());

        Bulldozer dozer2 = new Bulldozer("yellow", "large");
        System.out.println(dozer2.getColor());
        System.out.println(dozer2.getSize());
    }
}

