package com.company;

public class Flower extends Plant {
    private int summerGrowth = 10;
    private int springGrowth = 20;
    private int autumnGrowth = 0;
    private int winterGrowth = 0;

    public Flower(String name, int startGrowth){
        super(name, startGrowth);

    }

    @Override
    public int getSummerGrowth() {
        return summerGrowth;
    }

    @Override
    public int getSpringGrowth() {
        return springGrowth;
    }
    public int getWinterGrowth(){
        return 0;
    }
    public int getAutumnGrowth(){
        return 0;
    }
}
