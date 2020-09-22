package com.company;

public class World {
    private int sum;

    public World(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "World{" +
                "sum=" + sum +
                '}';
    }
}
