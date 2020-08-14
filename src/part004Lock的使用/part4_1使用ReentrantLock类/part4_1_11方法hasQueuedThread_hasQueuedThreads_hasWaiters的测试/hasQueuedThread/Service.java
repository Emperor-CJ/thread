package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_11方法hasQueuedThread_hasQueuedThreads_hasWaiters的测试.hasQueuedThread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition newCondition = lock.newCondition();
    public void waitMethod(){
        try{
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
