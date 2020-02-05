package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_4volatile非原子的特性;

/**
 * Created by chenjie on 2020/2/2.
 */
public class MyThread extends Thread {
    volatile public static int count;
    private static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
