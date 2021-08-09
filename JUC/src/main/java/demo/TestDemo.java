package demo;

import org.openjdk.jol.info.ClassLayout;

public class TestDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        A a = new A();

        Thread t1 = new Thread(() -> {
            System.out.println(ClassLayout.parseInstance(a).toPrintable());
            synchronized (a) {
                System.out.println(ClassLayout.parseInstance(a).toPrintable());
                synchronized (a){
                    System.out.println(ClassLayout.parseInstance(a).toPrintable());
                }
            }
            System.out.println(ClassLayout.parseInstance(a).toPrintable());
        }, "t1");
        t1.start();
        t1.join();


        System.out.println(ClassLayout.parseInstance(a).toPrintable());


    }
}


class A{}