package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_12多线程的死锁;

/**
 * Created by chenjie on 2020/2/1.
 */
public class Run {
    public static void main(String[] args) {
        try{
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
