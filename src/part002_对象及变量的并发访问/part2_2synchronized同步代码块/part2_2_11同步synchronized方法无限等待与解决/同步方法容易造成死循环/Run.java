package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_11同步synchronized方法无限等待与解决.同步方法容易造成死循环;

/**
 * Created by chenjie on 2020/1/31.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
