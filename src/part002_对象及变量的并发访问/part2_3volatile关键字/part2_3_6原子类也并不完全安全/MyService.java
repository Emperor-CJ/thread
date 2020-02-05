package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_6原子类也并不完全安全;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by chenjie on 2020/2/5.
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();

    //方法不是原子性的
    public void addNum(){
        System.out.println(Thread.currentThread().getName()
        + " 加了100之后的值是 ：" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
