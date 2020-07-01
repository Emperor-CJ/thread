package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_5使用多个condition实现通知部分线程_错误用法.MustUseMoreCondition_Error;

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
