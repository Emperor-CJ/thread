package cn.cj.thread.A_01_基础.B_04_interrupted;

public class interrupted_isInterrupted_1 {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                //中断标志位true是会退出循环，并且清除中断标志
                while (!Thread.currentThread().interrupted()){

                }

                System.out.println("threadOne isInterrupted:" + Thread.currentThread().isInterrupted());
            }
        });

        //启动线程
        threadOne.start();

        //设置中断标志
        threadOne.interrupt();

        threadOne.join();
        System.out.println("main  thread is over");
    }
}
