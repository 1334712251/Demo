package test.example.com.demo6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        aa aa = new aa();
        FutureTask<Integer> futureTask = new FutureTask<>(aa);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}

class aa implements Callable{

    @Override
    public String call() throws Exception {
        return "fffff";
    }
}