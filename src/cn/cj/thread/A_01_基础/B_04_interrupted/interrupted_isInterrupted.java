package cn.cj.thread.A_01_基础.B_04_interrupted;

public class interrupted_isInterrupted {
    public static void main(String[] args) throws InterruptedException{
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;){

                }
            }
        });

        //启动线程
        threadOne.start();

        //设置中断标志
        threadOne.interrupt();

        Thread.currentThread().interrupt();

        //获取中断标志
        System.out.println("isInterrupted:" + threadOne.isInterrupted());

        System.out.println("Thread current:" + Thread.currentThread().isInterrupted());

        //获取中断标志并重制
        System.out.println("isInterrupted:" + threadOne.interrupted());    //获取当前线程的中断关系，当前线程是main线程,并且清除中断的标识

        //获取中断标志并重置
        System.out.println("isInterrupted:" + Thread.interrupted());     //和  System.out.println("isInterrupted:" + threadOne.interrupted());  一样

        //获取中断标志
        System.out.println("isInterrupted:" + threadOne.isInterrupted());

        System.out.println("Thread:" + Thread.currentThread().isInterrupted());

        threadOne.join();

        System.out.println("main thread is over");
    }
}
