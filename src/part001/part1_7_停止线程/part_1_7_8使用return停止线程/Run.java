package part001.part1_7_停止线程.part_1_7_8使用return停止线程;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}
