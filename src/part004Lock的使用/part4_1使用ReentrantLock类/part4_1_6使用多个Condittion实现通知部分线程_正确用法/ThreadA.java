package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_6使用多个Condittion实现通知部分线程_正确用法;

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
