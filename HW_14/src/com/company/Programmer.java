package com.company;

public class Programmer extends Employee {


    public Programmer(String name, double salary) {
        super(name,salary);
    }

    public void work(){
        System.out.println("PROGRAMMER: I am writing code");
    }

   public void codeReview(){

   }
}