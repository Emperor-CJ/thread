package part001.part1_7_停止线程.part_1_7_3能停止的线程_异常法;

public class MyTread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()){
                System.out.println("已经是停止状态了，我要退出了！");
                break;
            }
            System.out.println("i=" + (i+ 1));
        }
        System.out.println("我在for下面。。。。。。。。。。。。");
    }
}
