package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_9静态同步synchronized方法与synchronizedclass代码块.验证不是同一把锁;


/**
 * Created by chenjie on 2020/1/31.
 */
public class Service {
    synchronized public static void printA(){
        try{
            System.out.println("线程名称为： " + Thread.currentThread().getName()
            + "在" + System.currentTimeMillis() + "进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为： " + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "离开printA");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public static void printB(){
        System.out.println("线程名称为： " + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "进入printB");
        System.out.println("线程名称为： " + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "离开printB");
    }

    synchronized public void printC(){
        System.out.println("线程名称为： " + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "进入printC");
        System.out.println("线程名称为： " + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "离开printC");
    }
}
