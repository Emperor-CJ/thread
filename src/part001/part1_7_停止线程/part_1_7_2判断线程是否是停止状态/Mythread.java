package part001.part1_7_停止线程.part_1_7_2判断线程是否是停止状态;

public class Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
