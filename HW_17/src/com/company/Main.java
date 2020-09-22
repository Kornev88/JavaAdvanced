package com.company;

public class Main {

    public static void main(String[] args) {
	int[] temperature = {-15,-2,10,8,17,0,3,14,29,7,11,12};
	Year[] years = new Year[temperature.length/4];
	int index = 0;
	for (int i = 0; i<temperature.length-3; i+=4){
	    years[index++] = new Year(temperature[i],
                temperature[i+1],temperature[i+2], temperature[i +3]);
    }
	for (Year year:years){
        System.out.println(year.toString());
    }
    }
}
