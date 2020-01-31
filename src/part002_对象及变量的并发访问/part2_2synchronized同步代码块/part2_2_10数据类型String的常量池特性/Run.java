package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_10数据类型String的常量池特性;

/**
 * Created by chenjie on 2020/1/31.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
