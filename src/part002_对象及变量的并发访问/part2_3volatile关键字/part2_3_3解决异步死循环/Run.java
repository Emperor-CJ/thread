package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_3解决异步死循环;

/**
 * Created by chenjie on 2020/2/2.
 */
public class Run {
    public static void main(String[] args) {
        try{
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值false");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
