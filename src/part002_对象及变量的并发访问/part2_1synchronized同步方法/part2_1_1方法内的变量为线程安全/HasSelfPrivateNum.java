package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_1方法内的变量为线程安全;

/**
 * HasSelfPrivateNum
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class HasSelfPrivateNum {
    public void add(String username){
        try{
            int num = 0;
            if (username.equals("a")){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
