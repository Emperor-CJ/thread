package part001.part1_10线程的优先级.part1_10_3优先级具有随机性;

/**
 * Run
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(5);
            thread1.start();

            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(6);
            thread2.start();
        }
    }
}
