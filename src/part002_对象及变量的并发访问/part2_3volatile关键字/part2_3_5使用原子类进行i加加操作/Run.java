package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_5使用原子类进行i加加操作;

/**
 * Created by chenjie on 2020/2/5.
 */
public class Run {
    public static void main(String[] args) {
        AddCountThread countService = new AddCountThread();
        Thread t1 = new Thread(countService);
        t1.start();

        Thread t2 = new Thread(countService);
        t2.start();

        Thread t3 = new Thread(countService);
        t3.start();

        Thread t4 = new Thread(countService);
        t4.start();

        Thread t5 = new Thread(countService);
        t5.start();
    }
}
