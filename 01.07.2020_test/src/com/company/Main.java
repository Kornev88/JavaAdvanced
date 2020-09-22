package com.company;

public class Main {

    public static void main(String[] args) {
        
        Employee[] employees = DBMock.getEmployees();


        for(Employee employee:employees){
            payForEmployee(employee);
        }

        for (Employee employee : employees) {
            employee.work();
        }
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        for (Employee employee : employees) {
            employee.pay();
        }
    }

    public static void payForEmployee(Employee employee) {
        employee.pay();
    }

}