package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_16锁对象的改变;

/**
 * Created by chenjie on 2020/2/2.
 */
public class ThreadA  extends Thread{
    private Myservice service;
    public ThreadA(Myservice service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
