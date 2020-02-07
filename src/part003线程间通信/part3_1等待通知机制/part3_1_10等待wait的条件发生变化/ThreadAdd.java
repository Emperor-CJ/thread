package part003线程间通信.part3_1等待通知机制.part3_1_10等待wait的条件发生变化;

/**
 * Created by chenjie on 2020/2/7.
 */
public class ThreadAdd extends Thread {
    private Add p;
    public ThreadAdd(Add p){
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
