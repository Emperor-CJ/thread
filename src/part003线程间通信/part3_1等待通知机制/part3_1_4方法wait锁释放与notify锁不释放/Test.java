package part003线程间通信.part3_1等待通知机制.part3_1_4方法wait锁释放与notify锁不释放;

/**
 * Created by chenjie on 2020/2/6.
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
