package com.company;

public class CProgrammer extends Programmer {
    public CProgrammer(String name, int salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("I am CProgrammer");
    }
    public void codeReview(){
        System.out.println("This C code is good");
    }
}
