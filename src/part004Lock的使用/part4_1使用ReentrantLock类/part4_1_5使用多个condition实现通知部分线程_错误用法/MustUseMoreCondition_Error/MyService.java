package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_5使用多个condition实现通知部分线程_错误用法.MustUseMoreCondition_Error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA 时间为 " + System.currentTimeMillis()
                    + " ThreadName= " + Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitA 时间为 " + System.currentTimeMillis()
                    + " ThreadName= " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB 时间为 " + System.currentTimeMillis()
                    + " ThreadName= " + Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitB 时间为 " + System.currentTimeMillis()
                    + " ThreadName= " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll() {
        try {
            lock.lock();
            System.out.println(" signalAll 时间为 " + System.currentTimeMillis()
                    + " ThreadName= " + Thread.currentThread().getName());
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
