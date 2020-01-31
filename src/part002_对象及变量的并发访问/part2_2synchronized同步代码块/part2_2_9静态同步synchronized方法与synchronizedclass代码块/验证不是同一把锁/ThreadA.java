package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_9静态同步synchronized方法与synchronizedclass代码块.验证不是同一把锁;

/**
 * Created by chenjie on 2020/1/31.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
