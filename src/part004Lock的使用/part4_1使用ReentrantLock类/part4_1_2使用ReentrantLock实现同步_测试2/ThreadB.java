package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_2使用ReentrantLock实现同步_测试2;

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
