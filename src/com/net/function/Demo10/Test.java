package com.net.function.Demo10;

import java.util.ArrayList;

public class Test {

    byte[] bytes = new byte[1*1024*1024];
    public static void main(String[] args) {
        ArrayList<Test> arrayList = new ArrayList<>();

        while (true){
            try {
                arrayList.add(new Test());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
