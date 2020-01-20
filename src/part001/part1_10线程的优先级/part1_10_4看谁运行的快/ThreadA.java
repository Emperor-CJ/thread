package part001.part1_10线程的优先级.part1_10_4看谁运行的快;

/**
 * ThreadA
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class ThreadA extends Thread{
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true){
            count++;
        }
    }
}
