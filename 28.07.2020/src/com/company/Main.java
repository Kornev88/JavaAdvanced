package com.company;

public class Main {

    public static void main(String[] args) {
	String[] names = {"Иванов Иван Иванович","Петров Пётр","Сидоров"};

    }
    public static Person[] getPersonFromArrayOfString(String[] names){
        Person[] persons;
        if(names!=null){
            persons = new Person[names.length];
        for (int i=0;i<names.length; i++){
            String[] strings = names[i].split(" ");
            switch (strings.length){
                case 1: persons[i] = new Person(nameStrings[0]);break;

                }
            }
        }


    }

}
