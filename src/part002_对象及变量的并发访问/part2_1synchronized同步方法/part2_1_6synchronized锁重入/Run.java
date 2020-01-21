package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_6synchronized锁重入;

/**
 * Run
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
