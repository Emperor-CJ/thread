package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_5脏读;

/**
 * PublicVar
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";
    synchronized public void setValue(String username, String password){
        try{
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name=" + Thread.currentThread().getName() + " username=" + username +
                    " password=" + password);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
//    public void getValue(){
//        System.out.println("getValue method thread name=" + Thread.currentThread().getName() + " username=" + username +
//                " password=" + password);
//    }

    synchronized public void getValue(){
        System.out.println("getValue method thread name=" + Thread.currentThread().getName() + " username=" + username +
                " password=" + password);
    }
}
