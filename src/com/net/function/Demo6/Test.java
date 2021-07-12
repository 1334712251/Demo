package com.net.function.Demo6;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Shuffle shuffle =new Shuffle();
        shuffle.poker();
        List<Integer> list = shuffle.list();
        Map<Integer, String> map = shuffle.map();
        System.out.println(map);
        List<Integer> shuffle1 = shuffle.shuffle(list);
        System.out.println(shuffle1);
        System.out.println("-----------------");
        Licensing licensing =new Licensing();
        licensing.licensIng(shuffle1);
        List<Integer> lista = licensing.lista();
        List<Integer> listb = licensing.listb();
        List<Integer> listc = licensing.listc();
        List<Integer> listd = licensing.listd();
        System.out.println(lista);
        System.out.println(listb);
        System.out.println(listc);
        System.out.println(listd);
        System.out.println("----------------------");
        SeeCard seeCard =new SeeCard();
        List<Integer> seea = seeCard.seeCard(lista);
        List<Integer> seeb = seeCard.seeCard(listb);
        List<Integer> seec = seeCard.seeCard(listc);
        List<Integer> seed = seeCard.seeCard(listd);
        System.out.println(seea);
        System.out.println(seeb);
        System.out.println(seec);
        System.out.println(seed);
        System.out.println("------------------------------");
        SeeCard seeing = new SeeCard();
        seeing.poker();
        Map<Integer, String> maps = seeing.map();
        Map<Integer, String> map1 = seeing.seeIng(seea, maps);
        Map<Integer, String> map2 = seeing.seeIng(seeb, maps);
        Map<Integer, String> map3 = seeing.seeIng(seec, maps);
        Map<Integer, String> map4 = seeing.seeIng(seed, maps);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
        System.out.println(map4);
    }
}
