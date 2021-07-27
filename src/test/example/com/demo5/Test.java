package test.example.com.demo5;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        Thread thread = new Thread("d") {
            @Override
            public void run() {
                try {
                    TimeUnit.MINUTES.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("ddddddddd");
            }
        };
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.setDaemon(true);
        thread.start();
    }
}
