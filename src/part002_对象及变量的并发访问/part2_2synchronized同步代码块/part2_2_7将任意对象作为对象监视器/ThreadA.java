package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_7将任意对象作为对象监视器;

/**
 * Created by chenjie on 2020/1/30.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a", "aa");
    }
}
