package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_14内置类与同步实验1;

/**
 * Created by chenjie on 2020/2/1.
 */
public class OutClass {
    static class Inner {
        public void method1() {
            synchronized ("其他的锁") {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() +
                            " i = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                }
            }
        }

        public synchronized void method2() {

            for (int i = 11; i <= 20; i++) {
                System.out.println(Thread.currentThread().getName() +
                        " i = " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }

        }
    }
}
