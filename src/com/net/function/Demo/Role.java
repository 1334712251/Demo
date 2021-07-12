package com.net.function.Demo;

public class Role {
    private String name;
    private int salary;
    private String id;

    public Role() {
    }

    public Role(String name, int salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //public abstract void workIng();
    public void workIng(){
        System.out.println("123");
    }
}
