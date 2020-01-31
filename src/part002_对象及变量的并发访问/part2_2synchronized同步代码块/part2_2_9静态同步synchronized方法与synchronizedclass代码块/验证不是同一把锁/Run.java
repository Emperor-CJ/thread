package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_9静态同步synchronized方法与synchronizedclass代码块.验证不是同一把锁;

/**
 * Created by chenjie on 2020/1/31.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
        ThreadC c = new ThreadC(service);
        c.setName("c");
        c.start();

    }
}
