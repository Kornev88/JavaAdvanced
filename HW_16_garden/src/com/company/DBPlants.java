package com.company;

public class DBPlants {
    private static Plant[] plants = {
            new Tree("Birch tree", 200),
            new Bush("Lilac bush", 50),
            new Flower("Rose", 0)
    };
    public static Plant[] getPlants(){
        return plants;
    }
}

