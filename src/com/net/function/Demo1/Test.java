package com.net.function.Demo1;

public class Test {
    public static void main(String[] args) {
        Developer developer1 = new Developer("林昊","程序员");
        developer1.selfIntroduction();
        Developer developer2 = new Developer("小昊","web");
        developer2.selfIntroduction();
        System.out.println(developer2.toString());
    }
}