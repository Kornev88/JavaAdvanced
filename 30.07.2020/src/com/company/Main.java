package com.company;

public class Main {

    public static void main(String[] args) {
        byte[] bytes = new byte[]{1,2,3,-1,2,1,4,1,2,1,-7,1};
        System.out.println(wordCounter(bytes));
    }

    public static World[] gerWorlds(byte[] bytes){

        return null;
    }
    public static int wordCounter(byte[] array){
        int wordCount=0;
        int wordLength=0;
        for(int i=0;i<array.length;i++){
            if (array[i]<0){
             if (wordLength>0){
                 wordCount++;
                 wordLength=0;
             }
            }else{
                wordLength++;
            }
        }
        if (wordLength>0){
            wordCount++;
        }
        return wordCount;
    }
}
