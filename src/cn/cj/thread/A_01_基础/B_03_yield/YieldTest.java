package cn.cj.thread.A_01_基础.B_03_yield;

public class YieldTest implements Runnable {
    YieldTest() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
//当 i=O 时让出 CPU执行权，放弃时 间片，进行下一轮调度
            if ((i % 5) == 0) {
                System.out.println(Thread.currentThread() + " yield cpu . . .");
//当前线程让 出 CPU执行权，放弃时间片，进行下一轮调度
                Thread.yield();

            }
        }
        System .out . println(Thread.currentThread() + " is over");
    }

    public static void main(String[] args) {
        new YieldTest();
        new YieldTest();
        new YieldTest();
    }
}
