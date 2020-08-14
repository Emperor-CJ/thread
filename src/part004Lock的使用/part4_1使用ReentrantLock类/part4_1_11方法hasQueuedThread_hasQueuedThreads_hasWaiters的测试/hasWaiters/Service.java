package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_11方法hasQueuedThread_hasQueuedThreads_hasWaiters的测试.hasWaiters;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = lock.newCondition();
    public void waitMethod(){
        try{
            lock.lock();
            System.out.println(Thread.currentThread().getName());
            newCondition.await();
            System.out.println("==" + Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void notityMethod(){
        try{
            lock.lock();
            System.out.println("有没有线程正在等待newCondition? "
            + lock.hasWaiters(newCondition) + " 线程数是多少？ "
            + lock.getWaitQueueLength(newCondition));
            newCondition.signal();
        }finally {
            lock.unlock();
        }
    }
}
