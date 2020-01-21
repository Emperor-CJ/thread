package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_7出现异常锁自动释放;

/**
 * Service
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class Service {
    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName =" + Thread.currentThread().getName() + " run beginTime=" + System.currentTimeMillis());
            int i = 1;
            while (i == 1){
                if (("" + Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName=" + Thread.currentThread().getName()
                    + " run exceptionTime="
                    + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else {
            System.out.println("Thread B run Time=" + System.currentTimeMillis());
        }
    }
}
