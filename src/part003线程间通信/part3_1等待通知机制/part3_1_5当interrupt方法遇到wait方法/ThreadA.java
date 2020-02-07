package part003线程间通信.part3_1等待通知机制.part3_1_5当interrupt方法遇到wait方法;

/**
 * Created by chenjie on 2020/2/7.
 */
public class ThreadA extends Thread {
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
