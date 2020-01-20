package part002_对象及变量的并发访问.part2_1synchronized同步方法.part2_1_4synchronized方法与锁对象;

/**
 * MyObject
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class MyObject {
    synchronized public void methodA(){
        try{
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
        try{
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName() + " begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
