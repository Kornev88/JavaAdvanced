package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] bankData = {"1234567891111111 Ira",
            "1334567891111111 Marie"};


        Card[] cards = cardClient(bankData);
        printArrayCard(cards);
        System.out.println(Arrays.toString(cards));


    }

    public static Card[] cardClient(String[] array){
        Card[] cards = new Card[array.length];
        for (int i=0; i<array.length; i++){
            String[] rez = array[i].split(" ");
            switch (getCardType(rez[0])){
                case 1:
                    cards[i]=new Master(new Person(rez[i]),rez[0]);
                    break;
                case 2:
                     cards[i]=new Visa(new Person(rez[i]),rez[0]);
                     break;
                default:
                    System.out.println("error");
            }
        }
        return cards;
    }
    public static int getCardType(String number){
        int type=0;
        if (number.startsWith("12")) return 1;
        if (number.startsWith("13")) return 2;
        return 0;
    }

    public static void printArrayCard(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card.toSecureString());
        }
    }

}
