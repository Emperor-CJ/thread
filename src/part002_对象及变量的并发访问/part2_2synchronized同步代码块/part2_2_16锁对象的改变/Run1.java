package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_16锁对象的改变;

/**
 * Created by chenjie on 2020/2/2.
 * 50毫秒过后线程B取得的锁是"456"
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        Myservice service = new Myservice();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        Thread.sleep(50);
        b.start();
    }
}
