package com.company;
//HW_15

public class EmployeeArray {
    private Employee[] employees;

    public EmployeeArray(Employee[] employees) {
        this.employees = employees;
    }
    public void payAll(){
        for(Employee employee:employees){
            employee.pay();
        }
        System.out.println("===========payALL============");
    }
    public void workAll(){
        for(Employee employee:employees){
            employee.work();
        }
        System.out.println("===========workAll=======");
    }
    public void printAll(){
        for(Employee employee:employees){
            System.out.println(employee);
        }
        System.out.println("==========printAll======");
    }
    public static void codeReviewAll(Employee[] employees){
        Programmer[] programmers=DBMock.getProgrammers(employees);
        for(Programmer programmer:programmers){
            System.out.println(programmer.getName());
            programmer.codeReview();
        }

    }


}
