package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_12方法isFair_isHeldByCurrnetThread_isLocked测试.isLocked;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;

    public Service (boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try{
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        }finally {
            lock.unlock();
        }
    }
}
