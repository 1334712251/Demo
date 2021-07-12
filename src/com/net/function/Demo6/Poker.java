package com.net.function.Demo6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poker {
    String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
    String[] colors = {"方片", "梅花", "红桃", "黑桃"};
    Map<Integer, String> map = new HashMap<>();
    int num = 0;
    List<String> list = new ArrayList<>();
    List<Integer> list1 =new ArrayList<>();

    public void poker() {
        for (String number : nums) {
            for (String color : colors) {
                num++;
                list.add(color.concat(number));
                String s = list.get(num - 1);
                map.put(num,s);
                list1.add(num);
            }
        }
        String kinglet ="小王";
        num++;
        map.put(num,kinglet);
        list1.add(num);
        String king ="大王";
        num++;
        map.put(num,king);
        list1.add(num);
    }
    public List<Integer> list(){
        return list1;
    }
    public Map<Integer, String> map(){
        return map;
    }
}
