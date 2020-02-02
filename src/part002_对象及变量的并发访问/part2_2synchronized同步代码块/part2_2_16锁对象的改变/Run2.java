package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_16锁对象的改变;

/**
 * Created by chenjie on 2020/2/2.
 * 去掉50毫秒
 * 线程A 和 B 持有的锁都是"123",虽然将锁改成了"456"
 * 但结果还是同步的
 * 因为A 和 B 共同争抢的锁是"123"
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Myservice service = new Myservice();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
