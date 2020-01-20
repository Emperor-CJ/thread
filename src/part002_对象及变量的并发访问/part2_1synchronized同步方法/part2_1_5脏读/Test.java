package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_5脏读;

/**
 * Test
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        PublicVar publicVar = new PublicVar();
        ThreadA threadA = new ThreadA(publicVar);
        threadA.start();
        Thread.sleep(200);
        publicVar.getValue();
    }
}
