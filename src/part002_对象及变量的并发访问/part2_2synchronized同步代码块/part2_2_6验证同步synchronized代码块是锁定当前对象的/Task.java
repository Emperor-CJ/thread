package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_6验证同步synchronized代码块是锁定当前对象的;

/**
 * Task
 *
 * @Author: chenjie
 * @Date: 2020/1/22
 */
public class Task {
    public void otherMethod() {
        System.out.println("-------------------------------run -- otherMethod");
    }

//    synchronized public void otherMethod() {
//        System.out.println("-------------------------------run -- otherMethod");
//    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName="
                        + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }
}
