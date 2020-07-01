package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_3使用Condition实现等待通知_错误用法与解决.UseConditionWaitNotifyError;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try{
            condition.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
