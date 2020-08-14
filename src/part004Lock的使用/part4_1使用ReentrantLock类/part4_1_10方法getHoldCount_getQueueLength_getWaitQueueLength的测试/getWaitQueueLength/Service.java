package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_10方法getHoldCount_getQueueLength_getWaitQueueLength的测试.getWaitQueueLength;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void waitMethod(){
        try{
            lock.lock();
            System.out.println(Thread.currentThread().getName());
            condition.await();
            System.out.println(Thread.currentThread().getName() + " === ");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void notityMethod(){
        try{
            lock.lock();
            System.out.println(" 有 " + lock.getWaitQueueLength(condition) + " 个线程正在等待condition");
            condition.signal();
        }finally {
            System.out.println("===========");
            lock.unlock();
        }
    }
}
