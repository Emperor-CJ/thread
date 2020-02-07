package part003线程间通信.part3_1等待通知机制.part3_1_5当interrupt方法遇到wait方法;

/**
 * Created by chenjie on 2020/2/7.
 */
public class Test {
    public static void main(String[] args) {
        try{
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
