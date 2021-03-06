package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_8细化验证3个结论.结论1;

/**
 * Created by chenjie on 2020/1/30.
 */
public class Service {
    public void testMethod1(MyObject object){
        synchronized (object){
            try{
                System.out.println("testMethod1__getLock time="
                + System.currentTimeMillis() + " run ThreadName="
                + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1__releaseLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
