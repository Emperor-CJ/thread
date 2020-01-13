package part001.part1_7_停止线程.part_1_7_1停止不了的线程;

/**
 * Created by chenjie on 2020/1/12.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
