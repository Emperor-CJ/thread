package part003线程间通信.part3_1等待通知机制.part3_1_10等待wait的条件发生变化;

/**
 * Created by chenjie on 2020/2/7.
 */
public class ThreadSubtract extends Thread {
    private Subtract r;
    public ThreadSubtract(Subtract r){
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
