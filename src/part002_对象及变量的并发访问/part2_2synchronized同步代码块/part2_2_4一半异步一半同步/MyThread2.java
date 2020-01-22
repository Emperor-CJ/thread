package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_4一半异步一半同步;

/**
 * MyThread1
 *
 * @Author: chenjie
 * @Date: 2020/1/22
 */
public class MyThread2 extends Thread {
    private Task task;
    public MyThread2(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
