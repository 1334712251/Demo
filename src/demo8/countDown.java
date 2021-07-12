package demo8;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class countDown {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        ExecutorService service = Executors.newFixedThreadPool(5);
        //创建5个线程，分别执行不通模块测试
        for (int i = 1; i <= 5; i++) {
            final int num = i;
            Runnable runnable = () -> {
                try {
                    //模拟测试耗时
                    Thread.sleep((long) (Math.random()*5000));
                    System.out.println("模块："+ num +"测试完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //测试完毕后执行减一操作
                    latch.countDown();
                }
            };
            service.submit(runnable);
        }
        System.out.println("等待模块检测...");
        //主线程等待，直到count为0
        latch.await();
        System.out.println("所有模块测试完毕,开始上线");
    }
}
