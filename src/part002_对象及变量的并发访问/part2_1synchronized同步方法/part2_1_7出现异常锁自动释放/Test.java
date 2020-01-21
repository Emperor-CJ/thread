package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_7出现异常锁自动释放;

/**
 * Test
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class Test {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(5000);

            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
