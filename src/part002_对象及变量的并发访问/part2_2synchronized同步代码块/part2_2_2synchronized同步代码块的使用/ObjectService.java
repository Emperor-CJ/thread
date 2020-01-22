package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_2synchronized同步代码块的使用;

/**
 * ObjectService
 *
 * @Author: chenjie
 * @Date: 2020/1/22
 */
public class ObjectService {
    public void serviceMethod(){
        try{
            synchronized (this){
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end end=" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
