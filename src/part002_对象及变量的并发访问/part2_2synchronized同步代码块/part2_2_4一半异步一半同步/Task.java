package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_4一半异步一半同步;

/**
 * Task
 *
 * @Author: chenjie
 * @Date: 2020/1/22
 */
public class Task {
    public void doLongTimeTask(){
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
        }
        System.out.println("");
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
            }
        }
    }
}
