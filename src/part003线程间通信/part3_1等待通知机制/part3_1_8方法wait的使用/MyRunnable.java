package part003线程间通信.part3_1等待通知机制.part3_1_8方法wait的使用;

/**
 * Created by chenjie on 2020/2/7.
 */
public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock){
                    System.out.println("wait begin timer="
                    + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end timer="
                    + System.currentTimeMillis());
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread t = new Thread(runnable1);
        t.start();
    }
}
