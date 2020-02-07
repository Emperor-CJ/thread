package part003线程间通信.part3_1等待通知机制.part3_1_7唤醒所有线程;

/**
 * Created by chenjie on 2020/2/7.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException{
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
        ThreadC c = new ThreadC(lock);
        c.start();Thread.sleep(1000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }
}
