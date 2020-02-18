package part003线程间通信.part3_2方法join的使用.part3_2_5方法join_long与sleep_long的区别.join_sleep_1;

/**
 * Created by chenjie on 2020/2/18.
 */
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b){
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try{
            synchronized (b){
                b.start();
                System.out.println("======");
                Thread.sleep(6000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
