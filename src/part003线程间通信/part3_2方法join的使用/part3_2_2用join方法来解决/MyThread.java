package part003线程间通信.part3_2方法join的使用.part3_2_2用join方法来解决;

/**
 * Created by chenjie on 2020/2/18.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
