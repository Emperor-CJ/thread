package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_9静态同步synchronized方法与synchronizedclass代码块;

/**
 * Created by chenjie on 2020/1/31.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}
