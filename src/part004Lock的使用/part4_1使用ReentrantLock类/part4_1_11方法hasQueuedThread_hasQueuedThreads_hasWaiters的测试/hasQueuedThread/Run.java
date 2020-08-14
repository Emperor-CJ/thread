package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_11方法hasQueuedThread_hasQueuedThreads_hasWaiters的测试.hasQueuedThread;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
