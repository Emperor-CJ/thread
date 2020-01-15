package part001.part1_7_停止线程.part_1_7_8使用return停止线程;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true){
            if (this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }
}
