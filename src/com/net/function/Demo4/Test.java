package com.net.function.Demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(80);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(50);
        list.add(70);
        list.add(90);
        //Integer integer= Collections.max(list);
        Collections.sort(list);
        Collections.reverse(list);
        //Collections.shuffle(list);
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
