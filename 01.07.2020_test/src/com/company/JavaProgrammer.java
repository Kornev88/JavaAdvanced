package com.company;

public class JavaProgrammer extends Programmer {
    public JavaProgrammer(String name, int salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("I am Java Programmer");
    }
    public void codeReview(){
        System.out.println("This Java code is good");
    }
}
