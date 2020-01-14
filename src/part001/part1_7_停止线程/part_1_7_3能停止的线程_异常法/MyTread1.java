package part001.part1_7_停止线程.part_1_7_3能停止的线程_异常法;

public class MyTread1 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()){
                    System.out.println("已经是停止状态了，我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i+ 1));
            }
            System.out.println("我在for下面。。。。。。。。。。。。");
        }catch (InterruptedException e){
            System.out.println("进 mythread1 run 的catch方法了");
            e.printStackTrace();
        }

    }
}
