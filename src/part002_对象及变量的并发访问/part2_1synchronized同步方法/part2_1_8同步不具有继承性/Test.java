package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_8同步不具有继承性;

/**
 * Test
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();
        MyThreadA a = new MyThreadA(sub);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(sub);
        b.setName("B");
        b.start();
    }
}
