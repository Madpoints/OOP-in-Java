package com.Madpoints;

public class SaloonCar extends Car {
    private int numberOfSeats;

    public SaloonCar(String color, String make, int numberOfSeats) {
        super(color, make);
        this.numberOfSeats = numberOfSeats;
    }

    public SaloonCar(String make, int numberOfSeats) {
        super(make);
        this.numberOfSeats = numberOfSeats;
    }

    public SaloonCar(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
