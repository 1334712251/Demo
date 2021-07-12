package demo5;

import java.io.Serializable;

public class Citation implements Serializable {

    public int i;

    public String s;

    public Integer integer;

    public A a;

    private Student stu;

    public Citation(int i, String s, Integer integer, A a, Student stu) {
        this.i = i;
        this.s = s;
        this.integer = integer;
        this.a = a;
        this.stu = stu;
    }

    public Citation(int i, String s, Integer integer, A a) {
        this.i = i;
        this.s = s;
        this.integer = integer;
        this.a = a;
    }

    public Citation() {
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }
}

