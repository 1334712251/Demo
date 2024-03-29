package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class dd{
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();

//
//        for (int i=0;i<100000;i++){
//            atomicInteger.set(i);
//            if (atomicInteger.compareAndSet(i, 99999)) {
//                System.out.println("jjj");
//                break;
//            }
//        }

        while (true){
            int i = (int) (Math.random() * 1000000);
            System.out.println(i);
            //atomicInteger.set(i);
            System.out.println(atomicInteger.get());
            boolean b = atomicInteger.compareAndSet(i, 1000099);
            System.out.println(b);
            if (b) {
                System.out.println(atomicInteger.get());
                System.out.println("jjj");
                break;
            }
        }
    }

    /**
    参数1，提供数组、可以是线程不安全数组或线程安全数组
    参数2，获取数组长度的方法
    参数3，自增方法，回传 array, index
    参数4，打印数组的方法
*/
    // supplier 提供者 无中生有 ()->结果
// function 函数 一个参数一个结果 (参数)->结果 , BiFunction (参数1,参数2)->结果
// consumer 消费者 一个参数没结果 (参数)->void, BiConsumer (参数1,参数2)->
    private static <T> void demo(
            Supplier<T> arraySupplier,
            Function<T, Integer> lengthFun,
            BiConsumer<T, Integer> putConsumer,
            Consumer<T> printConsumer ) {
        List<Thread> ts = new ArrayList<>();
        T array = arraySupplier.get();
        int length = lengthFun.apply(array);
        for (int i = 0; i < length; i++) {
            // 每个线程对数组作 10000 次操作
            ts.add(new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    putConsumer.accept(array, j%length);
                }
            }));
        }
        ts.forEach(t -> t.start()); // 启动所有线程
        ts.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }); // 等所有线程结束
        printConsumer.accept(array);
    }

}