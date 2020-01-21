package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_8同步不具有继承性;

/**
 * MyThreadA
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class MyThreadA extends Thread {
    private Sub sub;
    public MyThreadA(Sub sub){
        super();
        this.sub = sub;
    }

    @Override
    public void run() {

        sub.serviceMethod();
    }
}
