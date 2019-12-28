package cn.cj.thread.A_01_基础.B_05_死锁问题;

public class DeadLockTest2 {
    //创建资源
    private static Object resourceA = new Object();
    private static Object resourceB = new Object();

    public static void main(String[] args) {
        //创建线程A
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA){
                    System.out.println(Thread.currentThread() + " get ResourcesA");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread() + " waiting get resourcesB");
                    synchronized (resourceB){
                        System.out.println(Thread.currentThread() + " get ResourcesB");
                    }
                }
            }
        });

        //创建线程B
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceB){
                    System.out.println(Thread.currentThread() + " get ResourcesB");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread() + " waiting get resourcesA");
                    synchronized (resourceA){
                        System.out.println(Thread.currentThread() + " get ResourcesA");
                    }
                }
            }
        });

        //启动线程
        threadA.start();
        threadB.start();
    }
}
