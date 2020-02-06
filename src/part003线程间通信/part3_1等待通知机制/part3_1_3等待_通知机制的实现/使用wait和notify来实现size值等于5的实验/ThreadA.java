package part003线程间通信.part3_1等待通知机制.part3_1_3等待_通知机制的实现.使用wait和notify来实现size值等于5的实验;

/**
 * Created by chenjie on 2020/2/6.
 */
public class ThreadA extends Thread {
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try{
            synchronized (lock){
                if (MyList.size() != 5){
                    System.out.println("wait begin " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end " + System.currentTimeMillis());
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
