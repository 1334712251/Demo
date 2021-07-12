package com.net.function.Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
     /*   Object object = new Student("001","林昊",90000);
        Object object1 = new Student("001","林昊",90000);
        System.out.println(object.hashCode());
        System.out.println(object.getClass());
        System.out.println(object.toString());
        System.out.println(object.equals(object));
        System.out.println(object.equals(object1));
        System.out.println("---------------------");
        System.out.println(object);*/

        /*Scanner scanner =new Scanner(System.in);
        String a =scanner.nextLine();
        System.out.println(a);*/

        byte[] bytes = {97, 98, 99};
        String s = new String(bytes);
        System.out.println(s);
        System.out.println("-----------------------");
        String str ="asdfwerqtgg";
        String str1= "asD";
        String str3="";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.startsWith("a"));
        System.out.println(str3.isEmpty());
        System.out.println("------------------------------");
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("sd"));
        System.out.println(str.lastIndexOf("g"));
        System.out.println(str.substring(1,3));

    }

}
