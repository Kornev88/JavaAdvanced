package com.company;

public class Tree extends Plant {

    private int springGrowth = 15;
    private int summerGrowth = 15;
    private int autumnGrowth = 5;
    private int winterGrowth = 5;

    public Tree(String name, int startGrowth){
        super(name, startGrowth);
    }
    public int getSpringGrowth(){
        return springGrowth;
    }

    @Override
    public int getSummerGrowth() {
        return summerGrowth;
    }

    @Override
    public int getAutumnGrowth() {
        return autumnGrowth;
    }

    @Override
    public int getWinterGrowth() {
        return winterGrowth;
    }
}
