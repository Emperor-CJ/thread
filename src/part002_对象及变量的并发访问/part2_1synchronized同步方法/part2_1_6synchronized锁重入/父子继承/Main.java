package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_6synchronized锁重入.父子继承;

/**
 * Main
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class Main {
    public int i = 10;
    synchronized public void operateIMainMethod(){
        try{
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
