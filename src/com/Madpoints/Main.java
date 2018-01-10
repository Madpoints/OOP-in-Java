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
        FactoryWorker worker = new FactoryWorker();
        int result = worker.addNumbers(2, 3);
        System.out.println(result);
    }
}

