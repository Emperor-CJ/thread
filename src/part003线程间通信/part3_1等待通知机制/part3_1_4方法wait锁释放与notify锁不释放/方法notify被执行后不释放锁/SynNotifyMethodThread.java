package part003线程间通信.part3_1等待通知机制.part3_1_4方法wait锁释放与notify锁不释放.方法notify被执行后不释放锁;

/**
 * Created by chenjie on 2020/2/7.
 */
public class SynNotifyMethodThread extends Thread {
    private Object lock;
    public SynNotifyMethodThread(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
