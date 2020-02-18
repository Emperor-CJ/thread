package part003线程间通信.part3_2方法join的使用.part3_2_3方法join与异常;

/**
 * Created by chenjie on 2020/2/18.
 */
public class ThreadC extends Thread {
    private ThreadB threadB;
    public ThreadC (ThreadB threadB){
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
