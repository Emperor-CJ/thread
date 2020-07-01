package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_5使用多个condition实现通知部分线程_错误用法.MustUseMoreCondition_Error;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(3000);
        service.signalAll();
    }
}
