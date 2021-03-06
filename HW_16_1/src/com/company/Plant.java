package com.company;

public abstract class Plant {
    private String name;
    private int startGrowth;
    private int growth;

    private int springGrowth = 0;
    private int summerGrowth = 0;
    private int autumnGrowth = 0;
    private int winterGrowth = 0;

    public Plant(String name, int startGrowth) {
        this.name = name;
        this.startGrowth = startGrowth;
        this.growth = growth;
    }
    public abstract int getSpringGrowth();
    public abstract int getSummerGrowth();
    public abstract int getAutumnGrowth();
    public abstract int getWinterGrowth();

    protected void setGrowth(int growth){
        this.growth = growth;

    }
    public int getGrowth(){
        return growth;
    }
    public String getName(){
        return name;
    }
    protected void spring(){
        setGrowth(getGrowth()+getSpringGrowth());
        System.out.println("Spring: "+getName()+getSpringGrowth()+" cm ");


    }
    protected void summer() {
        setGrowth(getGrowth() + getSummerGrowth());
        System.out.println("Summer: " + getName() + getSummerGrowth() + " cm ");
    }
    protected void autumn() {
        setGrowth(getGrowth() + getAutumnGrowth());
        System.out.println("Autumn: " + getName() + getAutumnGrowth() + " cm ");
    }
    protected void winter() {
        setGrowth(getGrowth() + getWinterGrowth());
        System.out.println("Winter: " + getName() + getSpringGrowth() + " cm ");
    }

    }
