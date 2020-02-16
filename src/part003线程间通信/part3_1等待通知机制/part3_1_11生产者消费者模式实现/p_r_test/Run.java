package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.p_r_test;

/**
 * Created by chenjie on 2020/2/7.
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(r);
        threadP.start();
        threadC.start();
    }
}
