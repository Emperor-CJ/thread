package part003线程间通信.part3_1等待通知机制.part3_1_6只通知一个线程;

/**
 * Created by chenjie on 2020/2/7.
 */
public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait() ThreadName=" +
                Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() ThreadName="
                + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
