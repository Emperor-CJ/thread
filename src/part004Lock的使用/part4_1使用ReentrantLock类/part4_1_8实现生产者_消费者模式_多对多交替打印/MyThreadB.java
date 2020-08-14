package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_8实现生产者_消费者模式_多对多交替打印;


public class MyThreadB extends Thread {
    private MyService myService;

    public MyThreadB(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.get();
        }
    }
}
