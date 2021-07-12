package com.net.function.Demo6;

import java.util.*;

public class SeeCard extends Poker {

    public List<Integer> seeCard(List<Integer> list) {
        Collections.sort(list);
        return list;
    }

    public Map<Integer,String> seeIng(List<Integer> list, Map<Integer, String> map) {
        Map<Integer,String> map1 =new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            String s = map.get(integer);
            map1.put(integer,s);
        }
        return map1;
    }
}
