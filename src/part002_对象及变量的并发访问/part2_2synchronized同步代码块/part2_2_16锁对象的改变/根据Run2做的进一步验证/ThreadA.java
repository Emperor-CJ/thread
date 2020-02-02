package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_16锁对象的改变.根据Run2做的进一步验证;

/**
 * Created by chenjie on 2020/2/2.
 */
public class ThreadA extends Thread {
    private Service service;
    private Userinfo userinfo;

    public ThreadA(Service service, Userinfo userinfo){
        super();
        this.service = service;
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userinfo);
    }
}
