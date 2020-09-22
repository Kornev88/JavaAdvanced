package com.company;

public class Main {

    public static void main(String[] args) {
	Plant[] plants = DBPlants.getPlants();

	for (Plant plant:plants){
	    plant.year();
    }
    }
}
