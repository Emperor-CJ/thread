package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_7synchronized代码块有volatile同步的功能;

/**
 * Created by chenjie on 2020/2/5.
 */
public class Run {
    public static void main(String[] args) {
        try{
            Service service = new Service();
            TheadA a = new TheadA(service);
            a.start();

            Thread.sleep(1000);
            TheadB b = new TheadB(service);
            b.start();
            System.out.println("已经发起停止的命令了！");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
