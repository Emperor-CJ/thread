package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_4synchronized方法与锁对象;

/**
 * Run
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");

        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }


}
