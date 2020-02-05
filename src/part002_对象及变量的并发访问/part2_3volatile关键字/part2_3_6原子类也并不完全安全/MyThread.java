package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_6原子类也并不完全安全;

/**
 * Created by chenjie on 2020/2/5.
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
