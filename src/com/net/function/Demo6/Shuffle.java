package com.net.function.Demo6;

import java.util.Collections;
import java.util.List;

public class Shuffle extends Poker{

    public List<Integer> shuffle(List<Integer> list){
        Collections.shuffle(list);
        return list;
    }
}
