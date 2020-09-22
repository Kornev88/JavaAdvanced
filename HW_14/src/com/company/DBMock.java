package com.company;

public class DBMock {
    private static Employee[] employees = {
                new CProgrammer("Jack", 2000),
                new JavaProgrammer("Roman",3000),
                new Tester("Anna", 3800),
                new Tester("Kova", 5000),
                new JavaScriptProgrammer("Igor", 1100),
                new CProgrammer("Maxim", 2200),
                new JavaProgrammer("Rosa", 3300),
                new Manager("Vasya",7700,300),
                new Manager("Marie",5500, 50)

    };

    public static Employee[] getEmployees(){
        return employees;
    }
    public static Programmer[] getProgrammers(Employee[] employees){
        int counter=0;
        for(Employee employee: DBMock.employees){
            if(isProgrammer(employee)){
                counter++;
            }
        }
        if(counter>0){
            Programmer[] programmers= new Programmer[counter];
            int i=0;
            for(Employee employee: DBMock.employees) {
                if (isProgrammer(employee)) {
                    programmers[i]=(Programmer) employee;
                    i++;
                }
            }
         return programmers;
        }
        return null;
    }

    private static boolean isProgrammer(Employee employee){
        if(employee instanceof Programmer){
            return true;
        }
        return false;
    }
}
