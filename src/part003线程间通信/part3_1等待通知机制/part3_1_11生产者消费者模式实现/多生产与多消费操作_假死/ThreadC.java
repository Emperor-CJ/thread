package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.多生产与多消费操作_假死;


/**
 * Created by chenjie on 2020/2/7.
 */
public class ThreadC extends Thread {
    private C r;
    public ThreadC(C r){
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while (true){
            r.getValue();
        }
    }
}
