package com.company;

public class Main {

    public static void main(String[] args) {

        Booking b1 = new Booking(new StandartRoom("1", 2),
                new Person("Ivan"),
                new DateInterval(new Data(03, 05, 2020),
                        new Data(05, 05, 2020)));


        Booking b2 = new Booking(new SuiteRoom("2", 2),
                new Person("Roman"),
                new DateInterval(new Data(06, 06, 2020),
                        new Data(16, 06, 2020)));

        System.out.println(b1);
        System.out.println(b2);
    }

}
