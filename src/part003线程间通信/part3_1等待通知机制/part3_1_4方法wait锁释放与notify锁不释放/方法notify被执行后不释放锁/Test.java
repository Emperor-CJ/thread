package part003线程间通信.part3_1等待通知机制.part3_1_4方法wait锁释放与notify锁不释放.方法notify被执行后不释放锁;

/**
 * Created by chenjie on 2020/2/7.
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();

        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

        SynNotifyMethodThread c = new SynNotifyMethodThread(lock);
        c.start();
    }
}
