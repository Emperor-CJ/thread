package part003线程间通信.part3_2方法join的使用.part3_2_5方法join_long与sleep_long的区别.join_sleep_2;

/**
 * Created by chenjie on 2020/2/18.
 */
public class Run {
    public static void main(String[] args) {
        try{
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
