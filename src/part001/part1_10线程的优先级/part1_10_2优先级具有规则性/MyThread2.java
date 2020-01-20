package part001.part1_10线程的优先级.part1_10_2优先级具有规则性;

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
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("============= thread 2 use time=" + (endTime - beginTime));
    }
}
