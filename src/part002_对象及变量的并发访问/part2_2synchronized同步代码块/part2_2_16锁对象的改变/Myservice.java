package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_16锁对象的改变;

/**
 * Created by chenjie on 2020/2/2.
 */
public class Myservice {
    private String lock = "123";
    public void testMethod(){
        try{
            synchronized (lock){
                System.out.println(Thread.currentThread().getName() +
                " begin " + System.currentTimeMillis());

                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() +
                " end " + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
