package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_1方法内的变量为线程安全;

/**
 * Run
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(numRef);
        a.start();

        ThreadB b = new ThreadB(numRef);
        b.start();
    }
}
