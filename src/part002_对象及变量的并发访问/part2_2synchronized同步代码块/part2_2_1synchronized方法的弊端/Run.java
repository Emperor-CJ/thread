package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_1synchronized方法的弊端;

/**
 * Run
 *
 * @Author: chenjie
 * @Date: 2020/1/21
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        long beginTime = Commonutils.beginTime1;
        if (Commonutils.beginTime2 < Commonutils.beginTime1){
            beginTime = Commonutils.beginTime2;
        }
        long endTime = Commonutils.endTime1;
        if (Commonutils.endTime2 > Commonutils.endTime1){
            endTime = Commonutils.endTime2;
        }
        System.out.println("耗时：" + ((endTime - beginTime) / 1000));
    }
}
