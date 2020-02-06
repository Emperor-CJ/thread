package part003线程间通信.part3_1等待通知机制.part3_1_3等待_通知机制的实现.唤醒wait程序;

/**
 * Created by chenjie on 2020/2/6.
 */
public class Test {
    public static void main(String[] args) {
        try{
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(3000);
            MyThread2 t2 = new MyThread2(lock);
            t2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
