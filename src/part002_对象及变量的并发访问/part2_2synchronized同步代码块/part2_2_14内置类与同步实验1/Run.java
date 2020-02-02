package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_14内置类与同步实验1;

/**
 * Created by chenjie on 2020/2/2.
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner= new OutClass.Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"A");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"B");
        t1.start();
        t2.start();
    }
}
