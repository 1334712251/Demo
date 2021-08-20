package demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;


class c {
    public static void main(String[] args) {
        new d();
//
//        new AtomicReference().compareAndSet();
//        AtomicStampedReference atomicStampedReference = new AtomicStampedReference();
//        AtomicMarkableReference atomicMarkableReference = new AtomicMarkableReference();
//        atomicMarkableReference.compareAndSet();
//        atomicStampedReference.compareAndSet();
    }
}


class d implements DecimalAccount{

    private BigDecimal bigDecimal;




    @Override
    public BigDecimal getBalance() {
        return null;
    }

    @Override
    public void withdraw(BigDecimal amount) {

    }
}
public interface DecimalAccount {
    // 获取余额
    BigDecimal getBalance();
    // 取款
    void withdraw(BigDecimal amount);
    /**
     * 方法内会启动 1000 个线程，每个线程做 -10 元 的操作
     * 如果初始余额为 10000 那么正确的结果应当是 0
     */
    static void demo(DecimalAccount account) {
        List<Thread> ts = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            ts.add(new Thread(() -> {
                account.withdraw(BigDecimal.TEN);
            }));
        }
        ts.forEach(Thread::start);
        ts.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(account.getBalance());
    }
}


