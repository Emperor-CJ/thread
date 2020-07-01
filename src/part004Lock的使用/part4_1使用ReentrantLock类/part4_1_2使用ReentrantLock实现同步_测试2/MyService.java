package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_2使用ReentrantLock实现同步_测试2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public void methodA(){
        try{
            lock.lock();
            System.out.println("methodA begin ThreadName="
                                + Thread.currentThread().getName() + " time="
                                + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end ThreadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void methodB(){
        try{
            lock.lock();
            System.out.println("methodB begin ThreadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB end ThreadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
