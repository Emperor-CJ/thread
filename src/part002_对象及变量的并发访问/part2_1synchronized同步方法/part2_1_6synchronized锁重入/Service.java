package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_6synchronized锁重入;

/**
 * Service
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class Service {
    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");

    }

}
