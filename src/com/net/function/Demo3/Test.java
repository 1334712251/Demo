package com.net.function.Demo3;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set set =new HashSet();
        set.add("abc");
        set.add("dd");
        set.add("cc");
        //System.out.println(set);
        for (Object o : set) {
            String str =(String)o;
            System.out.println(str);
        }
        System.out.println("-----------------------");
        Student student=new Student("linhao");
        Student student1=new Student("xiaohao");
        Student student2=new Student("xiaohao");
        Student student3=new Student("xiaohao");
        Student student4=new Student("xiaohei");
        Student student5=new Student("xiaohei");
        Set<Student> set1 =new HashSet<>();
        set1.add(student);
        set1.add(student1);
        set1.add(student2);
        set1.add(student3);
        set1.add(student4);
        set1.add(student5);
        for (Student stu : set1) {
            System.out.println(stu);

        }
    }
}
