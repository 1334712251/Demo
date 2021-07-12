package com.net.function.Demo;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Role manager = new Manager();
        Role programmer = new Programmer();
        Manager mm =(Manager)manager;
        mm.ww();
        int dd=mm.num;
        System.out.println(dd);
        //manager.workIng();
        //programmer.workIng();
    }
}
