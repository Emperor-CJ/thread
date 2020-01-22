package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_6验证同步synchronized代码块是锁定当前对象的;

/**
 * MyThread1
 *
 * @Author: chenjie
 * @Date: 2020/1/22
 */
public class MyThread1 extends Thread {
    private Task task;
    public MyThread1(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
