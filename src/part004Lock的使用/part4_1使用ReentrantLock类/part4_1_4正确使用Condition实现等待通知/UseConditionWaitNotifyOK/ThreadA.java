package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_4正确使用Condition实现等待通知.UseConditionWaitNotifyOK;

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
