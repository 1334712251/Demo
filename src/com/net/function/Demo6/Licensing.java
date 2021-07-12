package com.net.function.Demo6;

import java.util.ArrayList;
import java.util.List;

public class Licensing extends Poker{

    List<Integer> lista = new ArrayList<>();
    List<Integer> listb = new ArrayList<>();
    List<Integer> listc = new ArrayList<>();
    List<Integer> listd = new ArrayList<>();

    public void licensIng(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if(i>=list.size()-3){
                listd.add(integer);
            } else if (integer%3==0){
                lista.add(integer);
            } else if (integer%3==1){
                listb.add(integer);
            } else {
                listc.add(integer);
            }
        }
    }
    public List<Integer> lista(){
        return lista;
    }
    public List<Integer> listb(){
        return listb;
    }
    public List<Integer> listc(){
        return listc;
    }
    public List<Integer> listd(){
        return listd;
    }
}
