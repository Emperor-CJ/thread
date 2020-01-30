package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_7将任意对象作为对象监视器.service;

/**
 * Created by chenjie on 2020/1/30.
 */
public class Service {
    private String anyString = new String();
    public void a(){
        try{
            synchronized (anyString){
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void b(){
        System.out.println("b begin");
        System.out.println("b end");
    }
}
