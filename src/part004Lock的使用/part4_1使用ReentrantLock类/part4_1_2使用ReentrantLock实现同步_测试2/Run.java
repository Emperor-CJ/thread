package part004Lock的使用.part4_1使用ReentrantLock类.part4_1_2使用ReentrantLock实现同步_测试2;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        aa.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        bb.start();


    }
}
