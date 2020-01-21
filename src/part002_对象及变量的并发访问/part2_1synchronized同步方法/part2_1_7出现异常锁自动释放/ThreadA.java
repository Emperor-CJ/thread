package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_7出现异常锁自动释放;

/**
 * ThreadA
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {

        service.testMethod();
    }
}
