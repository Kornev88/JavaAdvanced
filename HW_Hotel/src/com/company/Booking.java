package com.company;

public class Booking {
    Person person;
    Room room;
    Date checkIn;
    Date checkOut;

    public Booking(Person person, Room room, Date checkIn, Date checkOut) {
        this.person = person;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Booking: " +
                "Person: " + person +
                ", Room: " + room +
                ", checkIn " + checkIn +
                ", checkOut " + checkOut;
    }
}
