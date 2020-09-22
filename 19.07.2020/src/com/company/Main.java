package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fact(1));
    }
    public static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);



    }
}
