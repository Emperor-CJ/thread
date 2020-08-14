package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_7实现生产者消费者模式_一对一交替打印;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
        MyThreadB b = new MyThreadB(myService);
        b.start();
    }
}
