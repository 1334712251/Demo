package com.net.function.TestDemo;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        int str =10;
        Integer integer =str;
        int b =str;

        System.out.println(b);
        System.out.println("-----------------------------");

        String ing ="20";
        String ng ="29.99";
        String n1 ="asd";
        System.out.println(Integer.parseInt(ing));
        System.out.println(Float.parseFloat(ng)+99.99);
        System.out.println(n1.toCharArray());
        System.out.println("-----------------------------");

        Date date = new Date(1604064205068L);
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println("-------------------");
        Calendar calendar =Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DATE));
  /*      System.out.println(Calendar.HOUR_OF_DAY);
        System.out.println(Calendar.MINUTE);
        System.out.println(Calendar.SECOND);*/
        System.out.println("------------------------");
        calendar.set(Calendar.YEAR,1998);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println("------------------------");
        calendar.set(1938,10,10,9,9,9);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(Calendar.HOUR_OF_DAY);
        System.out.println(Calendar.MINUTE);
        System.out.println(Calendar.SECOND);
        System.out.println("------------------------");
        calendar.set(1888,1,2);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
    }
}
