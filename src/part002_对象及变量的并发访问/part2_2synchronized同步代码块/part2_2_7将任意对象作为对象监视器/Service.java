package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_7将任意对象作为对象监视器;

/**
 * Created by chenjie on 2020/1/29.
 */
public class Service {
    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();
    public void setUsernamePassword(String username, String password){
        try{
            synchronized (anyString){
                System.out.println("线程名称为：" + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "进入同步代码块");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("线程名称为：" + Thread.currentThread().getName()
                        + "在" + System.currentTimeMillis() + "离开同步代码块");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
