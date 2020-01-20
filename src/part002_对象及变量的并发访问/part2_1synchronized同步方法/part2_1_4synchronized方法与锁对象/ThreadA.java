package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_4synchronized方法与锁对象;

/**
 * ThreadA
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class ThreadA extends Thread {
    private MyObject object;
    public ThreadA(MyObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
