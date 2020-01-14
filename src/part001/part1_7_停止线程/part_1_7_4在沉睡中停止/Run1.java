package part001.part1_7_停止线程.part_1_7_4在沉睡中停止;

/**
 * 先停止再睡
 */
public class Run1 {
    public static void main(String[] args) {

        MyThread1 thread = new MyThread1();
        thread.start();
        thread.interrupt();

        System.out.println("end!");
    }
}
