package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_16锁对象的改变.根据Run2做的进一步验证;

/**
 * Created by chenjie on 2020/2/2.
 */
public class Run {
    public static void main(String[] args) {
        try{
            Service service = new Service();
            Userinfo userinfo = new Userinfo();
            ThreadA a = new ThreadA(service, userinfo);
            a.setName("a");
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(service,userinfo);
            b.setName("b");
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
