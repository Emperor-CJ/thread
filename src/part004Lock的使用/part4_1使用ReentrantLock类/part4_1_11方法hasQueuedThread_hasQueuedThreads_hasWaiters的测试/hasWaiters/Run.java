package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_11方法hasQueuedThread_hasQueuedThreads_hasWaiters的测试.hasWaiters;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final  Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
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
        service.notityMethod();
    }
}
