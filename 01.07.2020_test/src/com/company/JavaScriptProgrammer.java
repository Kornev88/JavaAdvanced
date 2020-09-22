package com.company;

public class JavaScriptProgrammer extends Programmer {
    public JavaScriptProgrammer(String name, int salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("I am JavaScriptProgrammer");
    }
    public void codeReview(){
        System.out.println("This JavaScript code is good");
    }
}
