package com.net.function.Demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Student student = new Student("aa");
        Student student1 = new Student("bb");
        Student student2 = new Student("cc");
        list.add(student);
        list.add(student1);
        list.add(student2);

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Student ii =(Student) listIterator.next();
            if (student1.equals(ii)) {
                //System.out.println(listIterator.next());
                listIterator.add("java");
                System.out.println(listIterator.next());
            }
            //System.out.println(listIterator.next());
            System.out.println(ii);
        }
        System.out.println("-------------------------");
        System.out.println(list);
    }
}
