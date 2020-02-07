package part003线程间通信.part3_1等待通知机制.part3_1_4方法wait锁释放与notify锁不释放.方法notify被执行后不释放锁;

/**
 * Created by chenjie on 2020/2/7.
 */
public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait() ThreadName="
                +Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() ThreadName="
                + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin notify() ThreadName="
                + Thread.currentThread().getName() + " time="
                + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(5000);
                System.out.println(" end notify() ThreadName="
                + Thread.currentThread().getName() + " time="
                + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
