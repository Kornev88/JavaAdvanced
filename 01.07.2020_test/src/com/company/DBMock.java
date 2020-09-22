package com.company;

import sun.font.CreatedFontTracker;

public class DBMock {
    public static Employee[] getEmployees() {
        Programmer p1 = new Programmer("Vanya", 3000);
        Programmer p2 = new Programmer("Roman", 8000);
        Tester t1 = new Tester("Sergey", 5000);
        Tester t2 = new Tester("Nick", 2700);
        Employee[] employees = new Employee[]{p1, p2, t1, t2};
        return employees;
    }
}
