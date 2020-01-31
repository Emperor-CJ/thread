package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_8细化验证3个结论.结论1;

/**
 * Created by chenjie on 2020/1/30.
 */
public class Run_1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service,object);
        b.setName("B");
        b.start();
    }
}
