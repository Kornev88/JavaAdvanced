package com.company;

public class Main {

    public static void main(String[] args) {

        String[] bonusList ={"Jack","Anna","Sascha"};
        Employee[] employees = DBMock.getEmployees();
        Programmer[] programmers=DBMock.getProgrammers();


        for (Employee employee : employees) {
            payForEmployee(employee);

        }

        for(Employee employee : employees) {
            System.out.println(employee.toString());

        }
        for (Employee employee : employees) {
            employee.work();

            }
        System.out.println("===================================");
        for(Programmer programmer:programmers){
            System.out.println(programmer.getName());

        }

    }
    public static void payForEmployee(Employee employee){
        employee.pay();
    }
}
