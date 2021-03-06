package com.company;

public class Booking {
    private int id;
    private Room room;
    private Person person;
    private DateInterval dateInterval;

    public Booking(Room room, Person person, DateInterval dateInterval) {
        this.room = room;
        this.person = person;
        this.dateInterval = dateInterval;
    }

    public Room getRoom() {
        return room;
    }

    public Person getPerson() {
        return person;
    }

    public DateInterval getDateInterval() {
        return dateInterval;
    }

    public double getPrice(){
        return this.room.getPrice()*this.dateInterval.getDays();

    }

    @Override
    public String toString() {
        return "Booking: " + room +
                ", person=" + person +
                " " + dateInterval+" \n\tPrice for "+this.dateInterval.getDays()+" days is "+getPrice()+"Euro";

    }
}
