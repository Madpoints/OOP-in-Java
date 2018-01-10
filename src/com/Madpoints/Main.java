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
        worker.count(5);
        worker.count(.4);
    }
}

