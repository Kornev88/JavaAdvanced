package com.company;

public class JavaScriptProgrammer extends Programmer {
    public JavaScriptProgrammer(String name,double salary) {
        super(name,salary);
    }

    public void codeReview(){
        System.out.println("This JavaScript code is good");
    }

    public void work() {

        System.out.println("I am JavaScriptProgrammer. I write JavaScript Programm");
    }
}

