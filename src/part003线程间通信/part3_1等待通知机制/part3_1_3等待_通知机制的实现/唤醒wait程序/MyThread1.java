package part003线程间通信.part3_1等待通知机制.part3_1_3等待_通知机制的实现.唤醒wait程序;

/**
 * Created by chenjie on 2020/2/6.
 */
public class MyThread1 extends Thread {
    private Object lock;
    public MyThread1(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try{
            synchronized (lock){
                System.out.println("开始  wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束  wait time=" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
