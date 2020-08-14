package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_12方法isFair_isHeldByCurrnetThread_isLocked测试.isHeldByCurrnetThread;

public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
