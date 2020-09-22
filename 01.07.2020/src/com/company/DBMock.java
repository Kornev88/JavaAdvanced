package com.company;

public class DBMock {
    private static Employee[] employees = {

                new CProgrammer("Jack", 2000.0),
                new JavaProgrammer("Sascha", 4000.0),
                new Tester("Jack", 3500.0),
                new Tester("Anna", 3700.0),
                new CProgrammer("Jack2", 2000),
                new CProgrammer("Jack3", 2020),
                new JavaProgrammer("Sascha1", 2030),
                new JavaProgrammer("Sascha2", 2040),
                new Manager("Misha",2500,333),
                new Manager("Misha2",2000,333)

    };


    public static Employee[] getEmployees() {
        return employees;
    }

    public static Programmer[] getProgrammers() {
        int counter=0;
        for(Employee employee:employees){  //считается сколько Программеров в массиве
            if(isProgrammer(employee)){
                counter++;
            }
        }
        if(counter>0){
            Programmer[] programmers = new Programmer[counter];
            int i=0;              //создается массив и вставляем в него программеров
            for (Employee employee:employees){
                if(isProgrammer(employee)){
                    programmers[i]=(Programmer) employee;
                    i++;
                }
            }
            return programmers;
        }

        return null;

    }

    private static boolean isProgrammer(Employee employee){
        if(employee instanceof Programmer){   //метод проверка
            return true;
        }
        return false;
    }
}


