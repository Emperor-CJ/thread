package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_8实现生产者_消费者模式_多对多交替打印;


public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA[] threadA  = new MyThreadA[10];
        MyThreadB[] threadB  = new MyThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadA[i] = new MyThreadA(myService);
            threadB[i] = new MyThreadB(myService);
            threadA[i].start();
            threadB[i].start();
        }
    }
}
