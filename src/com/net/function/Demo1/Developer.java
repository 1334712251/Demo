package com.net.function.Demo1;

public class Developer {
    private final static String DEPARTMENTNAME = "研发部";
    private String name;
    private String work;

    public Developer(String name, String work) {
        this.name = name;
        this.work = work;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void selfIntroduction(){
        System.out.println("我是"+DEPARTMENTNAME+"的"+name+",我的工作是"+work);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
