package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_10方法getHoldCount_getQueueLength_getWaitQueueLength的测试.getQueueLength;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public void serviceMethod1(){
        try{
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " 进入方法！");
            Thread.sleep(Integer.MAX_VALUE);
        }catch (InterruptedException e){
            e.printStackTrace();
        } finally{
            lock.unlock();
        }
    }

}
