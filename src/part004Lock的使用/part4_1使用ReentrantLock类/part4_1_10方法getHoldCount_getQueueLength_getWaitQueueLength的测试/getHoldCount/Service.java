package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_10方法getHoldCount_getQueueLength_getWaitQueueLength的测试.getHoldCount;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();
    public void serviceMethod1(){
        try{
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount=" + lock.getHoldCount());
            serviceMethod2();
        }finally {
            lock.unlock();
        }
    }

    public void serviceMethod2(){
        try{
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount=" + lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }
}
