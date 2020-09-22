package com.company;

public class Person {

    private String name;
    private int idNumber;

    public Person(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Name - " + name  +
                ", idNumber - " + idNumber;
    }
}
