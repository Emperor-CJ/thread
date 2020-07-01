package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_4正确使用Condition实现等待通知.UseConditionWaitNotifyOK;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
