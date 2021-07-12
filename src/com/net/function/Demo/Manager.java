package com.net.function.Demo;

public class Manager extends Role{

    int num;

    private int bonus;

    public Manager() {
    }

    public Manager(String name, int salary, String id, int bonus) {
        super(name, salary, id);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

   /* @Override
    public void workIng() {
        System.out.println("经理");
    }*/
    public void ww(){
        System.out.println("www");
    }
}
