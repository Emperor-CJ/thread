package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_2synchronized同步代码块的使用;

/**
 * Run
 *
 * @Author: chenjie
 * @Date: 2020/1/22
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
