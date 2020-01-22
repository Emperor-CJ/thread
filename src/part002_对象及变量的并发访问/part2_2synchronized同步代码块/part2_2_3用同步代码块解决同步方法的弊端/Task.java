package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_3用同步代码块解决同步方法的弊端;

/**
 * Task
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class Task {
    private String getData1;
    private String getData2;
    public void doLongTimeTask(){
        try{
            System.out.println("begin task");
            Thread.sleep(3000);
           String getData11 = "长时间处理任务后从远程返回的值 1 threadName=" + Thread.currentThread().getName();
           String getData22 = "长时间处理任务后从远程返回的值 2 threadName=" + Thread.currentThread().getName();
           synchronized (this){
               getData1 = getData11;
               getData2 = getData22;
           }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
