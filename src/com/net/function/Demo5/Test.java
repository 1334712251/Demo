package com.net.function.Demo5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<>();

        System.out.println(map.put(10,"abc"));
        System.out.println(map.put(60,"aaa"));
        System.out.println(map.put(20,"fff"));
        System.out.println(map.put(30,"fff"));
        System.out.println(map.put(40,"fff"));
        System.out.println(map);
        System.out.println(map.get(40));
        System.out.println(map.keySet());

        System.out.println("-------------------------");
        for (Integer integer : map.keySet()) {
            System.out.println(integer+"="+map.get(integer));
        }
        System.out.println("-------------------------");
        Set<Integer> key = map.keySet();
        Iterator<Integer> it= key.iterator();
        System.out.println(it);
        System.out.println("----------------------");
        while (it.hasNext()) {
            //System.out.println(it.next());
            System.out.println(map.get(it.next()));
        }
    }
}
