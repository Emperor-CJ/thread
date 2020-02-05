package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_5使用原子类进行i加加操作;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by chenjie on 2020/2/5.
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
