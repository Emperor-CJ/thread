package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_8实现生产者_消费者模式_多对多交替打印;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;
    public void  set(){
        try{
            lock.lock();
            while (hasValue == true){
                System.out.println("有可能☆☆连续");
                condition.await();
            }
            System.out.println("打印☆");
            hasValue = true;
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void  get(){
        try{
            lock.lock();
            while (hasValue == false){
                System.out.println("有可能♥♥连续");
                condition.await();
            }
            System.out.println("打印♥");
            hasValue = false;
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
