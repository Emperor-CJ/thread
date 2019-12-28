package cn.cj.thread.A_01_基础.B_02_wait和唤醒问题;

import java.util.LinkedList;
import java.util.Queue;

public class Wait {
    private static Queue<String> queue = new LinkedList<>();
    private static final Integer MAX_SIZE = 10;

    //生产线程
    public void producer() {
        synchronized (queue) {
            // 消费队列满，则 等待队列空闲
            while (queue.size() == MAX_SIZE) {
                try {
                    //挂起 当 前线程， 并释放通过同步块获取的 queue上的锁，，上消费者线程可以获取该锁，然后
                    //获取队列里面的元素
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 空闲则生成元素 ， 并通知消费者线程
            queue.add("test");
            queue.notifyAll();
        }
    }

    //消费者线程
    public void customer() {
        synchronized (queue) {
            // 消费队列为空
            while (queue.size() == 0) {
                try {
//挂起当前线程，并释放通过同步块获取的 queue 上的锁， 4上生产者线程可以获取该锁，将生产元素放入队列
                    queue.wait();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            //消费元素 ，并通知唤醒生产者线程
            queue.poll();
            queue.notifyAll();
        }
    }

}
