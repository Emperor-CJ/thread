package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_5代码块间的同步性;

/**
 * ThreadA
 *
 * @Author: chenjie
 * @Date: 2020/1/22
 */
public class ThreadB extends Thread {
    private ObjectService service;
    public ThreadB(ObjectService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
