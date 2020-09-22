package com.company;

public class StandartRoom extends Room {
    private final double priceCoefficient=1.0;


    public StandartRoom(String number, int capacity) {
        super(number, capacity);
    }
    public double getPrice(){
        return  getBasePrice()*priceCoefficient;
    }

    @Override
    public String toString() {
        return "StandartRoom №" + getNumber()+"("+getPrice()+")";

    }
}
