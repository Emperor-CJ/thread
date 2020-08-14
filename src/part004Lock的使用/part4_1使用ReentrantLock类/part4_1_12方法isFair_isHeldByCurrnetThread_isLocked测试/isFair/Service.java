package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_12方法isFair_isHeldByCurrnetThread_isLocked测试.isFair;

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
            System.out.println("公平锁情况 ： " + lock.isFair());
        }finally {
            lock.unlock();
        }
    }
}
