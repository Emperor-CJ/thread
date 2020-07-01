package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_3使用Condition实现等待通知_错误用法与解决.z3_ok;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
    }
}
