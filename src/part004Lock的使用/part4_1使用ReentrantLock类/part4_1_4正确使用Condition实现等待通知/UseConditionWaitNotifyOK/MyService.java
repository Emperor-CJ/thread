package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_4正确使用Condition实现等待通知.UseConditionWaitNotifyOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void await(){
        try{
            lock.lock();
            System.out.println("await 时间为 " + System.currentTimeMillis());
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signal(){
        try{
            lock.lock();
            System.out.println("signal 时间为 " + System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
