package com.company;

public class JavaProgrammer extends Programmer {
    public JavaProgrammer(String name, double salary) {
        super(name, salary);
    }

    public void codeReview() {
        System.out.println("This Java code is good");
    }

    public void work() {

        System.out.println("I am JavaProgrammer. I write Java Programm");
    }
}