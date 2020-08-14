package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_10方法getHoldCount_getQueueLength_getWaitQueueLength的测试.getQueueLength;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        Thread.sleep(2000);
        System.out.println("有线程数 ： " + service.lock.getQueueLength() + "在等待获取锁");
    }
}
