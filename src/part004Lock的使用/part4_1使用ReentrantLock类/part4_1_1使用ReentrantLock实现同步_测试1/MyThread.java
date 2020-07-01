package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_1使用ReentrantLock实现同步_测试1;

public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
