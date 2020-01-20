package part001.part1_10线程的优先级.part1_10_1线程优先级的继承特性;

/**
 * MyThread2
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThred2 run priority=" + this.getPriority());
    }
}
