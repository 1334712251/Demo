package demo;

import org.openjdk.jol.info.ClassLayout;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        Dog dog = new Dog();

        Dog dog1 = new Dog();

        for (int i = 0; i < 20; i++) {
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    System.out.println(ClassLayout.parseInstance(dog).toPrintable());
                    synchronized (dog) {
                        System.out.println(ClassLayout.parseInstance(dog).toPrintable());
                    }
                    System.out.println(ClassLayout.parseInstance(dog).toPrintable());
                }
            };
            thread1.start();
        }

        dog1.notify();
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    System.out.println("gggggg" + ClassLayout.parseInstance(dog).toPrintable());
                    synchronized (dog) {
                        System.out.println("gggggg" + ClassLayout.parseInstance(dog).toPrintable());
                    }
                    System.out.println("gggggg" + ClassLayout.parseInstance(dog).toPrintable());
                }
            };
            thread.start();
        }
    }

    static class Dog {
    }
}

