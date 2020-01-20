package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_1方法内的变量为线程安全;

/**
 * ThreadA
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.add("b");
    }
}
