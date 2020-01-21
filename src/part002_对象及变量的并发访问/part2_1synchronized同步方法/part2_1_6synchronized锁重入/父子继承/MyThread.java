package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_6synchronized锁重入.父子继承;

/**
 * MyThread
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
