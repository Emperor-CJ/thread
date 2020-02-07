package part003线程间通信.part3_1等待通知机制.part3_1_4方法wait锁释放与notify锁不释放;

/**
 * Created by chenjie on 2020/2/6.
 */
public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait()");
                lock.wait();
                //改成sleep就会出现同步效果，sleep方法不释放锁
                //Thread.sleep(40000);
                System.out.println("end wait");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
