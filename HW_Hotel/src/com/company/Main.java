package com.company;

public class Main {

    public static void main(String[] args) {
	Person person1 = new Person("Ivanov",25653);
	Room room1 = new Room(2,"Standart");
	Date checkIN1 = new Date(28,"July",2020);
	Date checkOut1 = new Date(30,"July",2020);

	Booking booking1 = new Booking(person1,room1,checkIN1,checkOut1);
        System.out.println(booking1.toString());

     Person person2 = new Person("Hensle",333331);
     Room room2 = new Room(5,"lux");
     Date checkIn2 = new Date(22,"August",2020);
     Date checkOut2 = new Date(01,"September",2020);

     Booking booking2 = new Booking(person2,room2,checkIn2,checkOut2);
		System.out.println(booking2.toString());
    }


}
