package part001.part1_10线程的优先级.part1_10_3优先级具有随机性;

import java.util.Random;

/**
 * MyThread1
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("thread  2  use  time = " + (endTime - beginTime));
    }
}
