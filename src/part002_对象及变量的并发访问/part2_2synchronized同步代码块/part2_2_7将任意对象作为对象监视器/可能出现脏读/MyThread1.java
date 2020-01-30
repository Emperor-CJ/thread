package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_7将任意对象作为对象监视器.可能出现脏读;

import part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_7将任意对象作为对象监视器.ThreadA;

/**
 * Created by chenjie on 2020/1/30.
 */
public class MyThread1 extends Thread {
    private MyOneList list;
    public MyThread1 (MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService msref = new MyService();
        msref.addServiceMEthod(list,"A");
    }
}
