package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_2synchronized同步代码块的使用;

/**
 * ThreadA
 *
 * @Author: chenjie
 * @Date: 2020/1/22
 */
public class ThreadA extends Thread {
    private ObjectService service;
    public ThreadA(ObjectService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
