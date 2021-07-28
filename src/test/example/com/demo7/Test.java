package test.example.com.demo7;

import java.util.concurrent.TimeUnit;

public class Test {

    static int count = 0;

    static Object obj = new Object();

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    synchronized (obj) {
                        count++;
                    }
                }
                System.out.println(this.getName());
            }
        };

        Thread t2 = new Thread("t2") {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    synchronized (obj) {
                        count--;
                    }
                }
                System.out.println(this.getName());
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
        System.out.println(count);
    }
}