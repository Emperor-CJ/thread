package part003线程间通信.part3_2方法join的使用.part3_2_5方法join_long与sleep_long的区别.join_sleep_1;

/**
 * Created by chenjie on 2020/2/18.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("b run begin timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run end timer=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void bService(){
        System.out.println("打印了bService timer=" + System.currentTimeMillis());
    }
}
