package com.company;

public abstract class Person {
    private String name;
    private String surname;
    private String middleName;

    public Person(String name, String surname, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    public Name getName() {
        return name;
    }

    public Surname getSurname() {
        return surname;
    }

    public MiddleName getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", surname=" + surname +
                ", middleName=" + middleName +
                '}';
    }

}
