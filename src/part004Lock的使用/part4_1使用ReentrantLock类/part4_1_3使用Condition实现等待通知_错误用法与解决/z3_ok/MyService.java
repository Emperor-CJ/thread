package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_3使用Condition实现等待通知_错误用法与解决.z3_ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void waitMethod(){
        try{
            lock.lock();
            System.out.println("A");
            condition.await();
            System.out.println("B");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("所释放了");
        }
    }
}
