package com.net.function.Demo7;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {

        Student student = new Student("林昊",11);
        Class<? extends Student> aClass = student.getClass();
        System.out.println(student.getName());
        System.out.println("aClass = " + aClass);

        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.getConstructor(String.class,int.class));
        Constructor<Student> constructor = studentClass.getConstructor(String.class, int.class);
        System.out.println("constructor = " + constructor.newInstance("qq",11).getAge());
        System.out.println("studentClass = " + studentClass);

        Class<?> clazz = Class.forName("com.net.function.Demo7.Student");
        System.out.println("clazz = " + clazz);
    }
}


