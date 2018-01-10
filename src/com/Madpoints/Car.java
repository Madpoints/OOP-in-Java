package com.Madpoints;

public class Car {
    private String color;
    private String make;

    public Car(String color, String make) {
        this.color = color;
        this.make = make;
    }

    public Car(String make) {
        this.make = make;
    }

    public Car() {

    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }
}
