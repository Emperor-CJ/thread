package part003线程间通信.part3_1等待通知机制.part3_1_3等待_通知机制的实现.使用wait和notify来实现size值等于5的实验;

/**
 * Created by chenjie on 2020/2/6.
 */
public class ThreadB extends Thread {
    private Object lock;
    public ThreadB(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try{
            synchronized (lock){
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5){
                        lock.notify();
                        System.out.println("已发出通知！");
                    }
                    System.out.println("添加了" + (i+1) + "个元素！");
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
