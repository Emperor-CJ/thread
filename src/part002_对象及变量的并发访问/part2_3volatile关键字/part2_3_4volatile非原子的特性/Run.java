package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_4volatile非原子的特性;

/**
 * Created by chenjie on 2020/2/2.
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreadArray = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreadArray[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreadArray[i].start();
        }
    }
}
