package com.company;

public class Room {
    private int number;
    private String category;

    public Room(int number, String category) {
        this.number = number;
        this.category = category;
    }

    public int getNumber() {
        return number;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Room number: " + number +
                ", Category: " + category;
    }
}
