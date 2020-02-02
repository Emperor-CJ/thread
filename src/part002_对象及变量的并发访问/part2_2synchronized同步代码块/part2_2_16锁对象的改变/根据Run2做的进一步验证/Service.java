package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_16锁对象的改变.根据Run2做的进一步验证;

/**
 * Created by chenjie on 2020/2/2.
 */
public class Service {
    public void serviceMethodA(Userinfo userinfo){
        synchronized (userinfo){
            try {
                System.out.println(Thread.currentThread().getName());
                userinfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end! time=" + System.currentTimeMillis());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
