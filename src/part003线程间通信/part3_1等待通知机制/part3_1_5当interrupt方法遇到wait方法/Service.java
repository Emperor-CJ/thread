package part003线程间通信.part3_1等待通知机制.part3_1_5当interrupt方法遇到wait方法;

/**
 * Created by chenjie on 2020/2/7.
 */
public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("end wait()");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了");
        }
    }
}
