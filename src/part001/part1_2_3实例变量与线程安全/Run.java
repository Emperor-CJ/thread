package part001.part1_2_3实例变量与线程安全;

public class Run {
    public static void main(String[] args) {

        //数据不共享的情况
//        MyThread a = new MyThread("A");
//        MyThread b = new MyThread("B");
//        MyThread c = new MyThread("C");
//        a.start();
//        b.start();
//        c.start();

        //数据共享的情况
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
