package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_6synchronized锁重入.父子继承;

/**
 * Sub
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class Sub extends Main{
    synchronized public void operateISubMethod(){
        try{
            while (i > 0){
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
