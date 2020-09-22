package com.company;

public class CProgrammer extends Programmer {

    public CProgrammer(String name,double salary) {
        super(name,salary);
    }

    public void codeReview(){
        System.out.println("This C code is good");
    }

    public void work() {

        System.out.println("I am CProgrammer. I write C Programm");
    }
}

