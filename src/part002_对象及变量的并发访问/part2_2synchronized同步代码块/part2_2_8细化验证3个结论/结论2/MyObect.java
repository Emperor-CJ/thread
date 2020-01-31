package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_8细化验证3个结论.结论2;

/**
 * Created by chenjie on 2020/1/30.
 */
public class MyObect {
    synchronized public void speedPrintString(){
        System.out.println("speedPrintString __getLock time="
        + System.currentTimeMillis() + " run ThreadName="
        + Thread.currentThread().getName());
        System.out.println("------------------");
        System.out.println("speedPrintString __releaseLock time="
                + System.currentTimeMillis() + " run ThreadName="
                + Thread.currentThread().getName());
    }
}
