package part003线程间通信.part3_1等待通知机制.part3_1_1不使用等待_通知机制实现线程间通信;

/**
 * Created by chenjie on 2020/2/5.
 */
public class Test {
    public static void main(String[] args) {
        MyList service = new MyList();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
