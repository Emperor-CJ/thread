package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_3用同步代码块解决同步方法的弊端;


/**
 * MyThread1
 *
 * @Author: chenjie
 * @Date: 2020/1/21
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
        Commonutils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        Commonutils.endTime1 = System.currentTimeMillis();
    }
}
