package test.example.com.demo2;

import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void main(String[] args) {
        // 可以
        List<? super Number> list = new ArrayList<>();

        list.add(10);
        list.add(20L);
        list.add(20.2);
        Object object = list.get(0);
        System.out.println(object);

        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);

        list2.add(11L);
        list2.add(21L);

        read(list1);
        read(list2);
    }

    private static void read(List< ? extends Number> list) {
        Number first = list.get(0);
        Number last = list.get(list.size() - 1);
        System.out.println("first = " + first + " last = " + last);
    }
}