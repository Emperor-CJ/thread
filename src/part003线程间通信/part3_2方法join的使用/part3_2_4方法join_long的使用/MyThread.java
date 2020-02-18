package part003线程间通信.part3_2方法join的使用.part3_2_4方法join_long的使用;

/**
 * Created by chenjie on 2020/2/18.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
