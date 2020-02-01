package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_12多线程的死锁;

/**
 * Created by chenjie on 2020/1/31.
 */
public class DealThread implements Runnable {

    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();
    public void setFlag(String username){
        this.username = username;
    }

    @Override
    public void run() {
        if (username.equals("a")){
            synchronized (lock1){
                try{
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("按lock1 -> lock2 代码顺序执行了");
                }
            }
        }
        if (username.equals("b")){
            synchronized (lock2){
                try{
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("按lock2 -> lock1 代码顺序执行了");
                }
            }
        }
    }
}
