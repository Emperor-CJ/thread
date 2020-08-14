package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_6使用多个Condittion实现通知部分线程_正确用法;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();
    public void awaitA(){
        try{
            lock.lock();
            System.out.println("begin awaitA 时间为 " + System.currentTimeMillis()
                                + " ThreadName=" + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end awaitA 时间为 " + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try{
            lock.lock();
            System.out.println("begin awaitB 时间为 " + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end awaitB 时间为 " + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll_A(){
        try{
            lock.lock();
            System.out.println("signalAll_A 时间为 " + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            conditionA.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll_B(){
        try{
            lock.lock();
            System.out.println("signalAll_A 时间为 " + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            conditionA.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
