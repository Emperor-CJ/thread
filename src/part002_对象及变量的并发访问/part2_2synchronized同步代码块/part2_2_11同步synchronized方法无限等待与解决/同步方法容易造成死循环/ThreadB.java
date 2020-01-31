package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_11同步synchronized方法无限等待与解决.同步方法容易造成死循环;

/**
 * Created by chenjie on 2020/1/31.
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
