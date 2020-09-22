package com.company;

// IS A Наследование
public class Main {

    public static void main(String[] args) {
        // write your code here

        String[] bonusList = {"Jack","Anna","Kova"};
        Employee[] employees = DBMock.getEmployees();
        Programmer[] programmers=DBMock.getProgrammers(employees);
        System.out.println("=============EmployeeArray=========");
        EmployeeArray employeeArrays = new EmployeeArray(DBMock.getEmployees());
        employeeArrays.printAll();
        employeeArrays.payAll();
        employeeArrays.workAll();

        System.out.println("==============pay==========");
        for (Employee employee : employees) {
            payForEmployee(employee);

        }
        System.out.println("=======Employees========");
        for (Employee employee : employees) {
            System.out.println(employee);

        }
        System.out.println("===========work=============");
        for (Employee employee : employees) {
            employee.work();

         }



        System.out.println("=====codeReview Programmers=====");
        for(Programmer programmer:programmers){
            System.out.println(programmer.getName());
            System.out.print("  ");
            programmer.codeReview();

        }

    }

    public static boolean isBonus(String[] bonusList,String name){
        for(String str:bonusList){
            if(str.equals(name)){
                return true;
            }
        }
       return false;
    }
    public static void payForEmployee(Employee employee) {
        employee.pay();

    }


}
