package part001.part1_10线程的优先级.part1_10_1线程优先级的继承特性;

/**
 * MyThread1
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
