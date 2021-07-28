package test.example.com.demo7;

public class Test {

    static int count=0;

    public static void main(String[] args) {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                for (int i=0;i<10000;i++){
                    count++;
                }
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread t2 = new Thread("t2") {
            @Override
            public void run() {
                for (int i=0;i<10000;i++){
                    count--;
                }
                System.out.println(Thread.currentThread().getName());
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
        System.out.println(count);
    }
}
