package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_7synchronized代码块有volatile同步的功能;

/**
 * Created by chenjie on 2020/2/5.
 */
public class TheadA extends Thread {
    private Service service;
    public TheadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
