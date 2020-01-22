package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_5代码块间的同步性;

/**
 * ObjectService
 *
 * @Author: chenjie
 * @Date: 2020/1/22
 */
public class ObjectService {
    public void serviceMethodA(){
        try{
            synchronized (this){
                System.out.println("A begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end   end=" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B  begin time =" + System.currentTimeMillis());
            System.out.println("B  end    end=" + System.currentTimeMillis());
        }
    }
}
