package test.example.com.demo5;

public class Test {

    public static void main(String[] args) {
        Thread thread = new Thread("d") {
            @Override
            public void run() {
                System.out.println("dddddddddd");
            }
        };
        thread.start();
    }
}
