package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_6验证同步synchronized代码块是锁定当前对象的;

/**
 * Run
 *
 * @Author: chenjie
 * @Date: 2020/1/22
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        Thread.sleep(10);
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
