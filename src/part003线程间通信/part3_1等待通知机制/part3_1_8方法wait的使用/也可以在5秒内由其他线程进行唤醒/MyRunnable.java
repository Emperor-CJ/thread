package part003线程间通信.part3_1等待通知机制.part3_1_8方法wait的使用.也可以在5秒内由其他线程进行唤醒;

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

    static private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("notify begin timer="
                + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end timer="
                 + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(runnable1);
        t.start();
        Thread.sleep(3000);
        Thread t2 = new Thread(runnable2);
        t2.start();
    }
}
