package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_8细化验证3个结论.结论2;

/**
 * Created by chenjie on 2020/1/30.
 */
public class ThreadA extends Thread {
    private Service service;
    private MyObect object;
    public ThreadA(Service service, MyObect object){
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
