package com.Madpoints;

public class FactoryWorker {
    private double count;

    public FactoryWorker() {
    }

    public void count(int number) {
        count += number;
        System.out.println(count);
    }

    public void count(double number) {
        count += number;
        System.out.println(count);
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCount() {
        return count;
    }
}
