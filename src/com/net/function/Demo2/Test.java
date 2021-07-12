package com.net.function.Demo2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student = new Student("aa");
        Student student1 = new Student("bb");
        Student student2 = new Student("cc");
        Student student3 = new Student("cc");
        String qq="cc";
        String qq1="cc";
        System.out.println(qq.equals(qq1));
        System.out.println("qqq"+student2.equals(student3));
        list.add(student);
        list.add(student1);
        list.add(student2);
        System.out.println(list);
        System.out.println(list.get(1));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------");
        for (Object obj : list) {
            System.out.println(obj);
        }
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("---------------------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Student ii =(Student) iterator.next();
            if (student1.equals(ii)){
                System.out.println(ii);
            }
        }
    }
}
