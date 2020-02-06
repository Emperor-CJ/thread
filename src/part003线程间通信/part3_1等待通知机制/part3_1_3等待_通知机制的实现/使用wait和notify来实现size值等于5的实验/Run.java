package part003线程间通信.part3_1等待通知机制.part3_1_3等待_通知机制的实现.使用wait和notify来实现size值等于5的实验;

/**
 * Created by chenjie on 2020/2/6.
 */
public class Run {
    public static void main(String[] args) {
        try{
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(lock);
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
