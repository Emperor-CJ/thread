package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_8同步不具有继承性;

/**
 * Main
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class Sub extends Main{
    @Override
     public void serviceMethod(){
        try{
            System.out.println("int sub 下一步 sleep begin threadName="
            + Thread.currentThread().getName() + " time="
            + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步sleep end threadName="
            + Thread.currentThread().getName() + " time="
            + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
