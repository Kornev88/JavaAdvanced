package com.company;

public class EmployeeArray {
    private Employee[] employees;
    private DBMock dbMock;


    public EmployeeArray(Employee[] employees) {
        this.employees = employees;
    }
    public void PrintAll(){
        PrintAll(this.employees);
    }
    public static void PrintAll(Employee[] employees){
        for(Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println("=======================");
    }
}

