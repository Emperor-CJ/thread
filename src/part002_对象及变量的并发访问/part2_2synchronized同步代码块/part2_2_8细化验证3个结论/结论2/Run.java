package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_8细化验证3个结论.结论2;

/**
 * Created by chenjie on 2020/1/30.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyObect object = new MyObect();
        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        a.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(object);
        b.setName("b");
        b.start();
    }
}
