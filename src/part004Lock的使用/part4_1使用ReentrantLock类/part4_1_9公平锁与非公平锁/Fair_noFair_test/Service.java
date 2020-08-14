package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_9公平锁与非公平锁.Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try{
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " 获得锁定");
        }finally {
            lock.unlock();
        }
    }
}
