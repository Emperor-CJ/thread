package part003线程间通信.part3_2方法join的使用.part3_2_5方法join_long与sleep_long的区别.join_sleep_2;

/**
 * Created by chenjie on 2020/2/18.
 */
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b){
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try{
            synchronized (b){
                b.start();
                b.join();//说明join释放锁了
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                    //System.out.println(i);
                }

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
