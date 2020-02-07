package part003线程间通信.part3_1等待通知机制.part3_1_7唤醒所有线程;

/**
 * Created by chenjie on 2020/2/7.
 */
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            lock.notifyAll();
        }
    }
}
