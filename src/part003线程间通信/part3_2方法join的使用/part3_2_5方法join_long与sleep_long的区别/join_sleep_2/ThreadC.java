package part003线程间通信.part3_2方法join的使用.part3_2_5方法join_long与sleep_long的区别.join_sleep_2;

/**
 * Created by chenjie on 2020/2/18.
 */
public class ThreadC extends Thread {
    private ThreadB threadB;
    public ThreadC(ThreadB threadB){
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
