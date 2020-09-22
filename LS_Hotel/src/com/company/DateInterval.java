package com.company;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Random;

public class DateInterval {
    private Data start;
    private Data finish;
    private static Random rnd = new Random(System.currentTimeMillis());
    private int days=0;

    public DateInterval(Data start, Data finish) {
        this.start = start;
        this.finish = finish;

    }

    public Data getStart() {
        return start;
    }

    public Data getFinish() {
        return finish;
    }
    public int getDays(){
       /* int min=1;
        int max = 100;
        if (days == 0){
            days=min+rnd.nextInt(max-min+1);

        }
        10.10.2016.........03.08.2020
        */
        if (days==0){
            for(int i = start.getYear();i<finish.getYear();i++){
                days+=Data.getDaysPerYear(i);
            }
            days-=start.daysFromNewYear();
            days+=finish.daysFromNewYear();
        }
        return days;
    }

    @Override
    public String toString() {
        return "["+start +
                ";" + finish +
                "]";
    }
}
