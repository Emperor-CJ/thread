package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_10数据类型String的常量池特性;

/**
 * Created by chenjie on 2020/1/31.
 */
public class Service {
    public static void print(String stringParam){
        try{
            synchronized (stringParam){
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
