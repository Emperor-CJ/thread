package cn.cj.thread.A_01_基础.B_07_ThreadLocal;

public class ThreadLocalTest {

    //创建ThreadLocal变量
    static ThreadLocal<String> localVariable = new ThreadLocal<>();

    //print函数
    static void print(String str){
        //1. 打印当前线程本地内存中localVariable变量的值
        System.out.println(str + ":" + localVariable.get());
        //2.清除当前线程本地内存中的localVariable变量
//        localVariable.remove();
    }

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程One中本地变量localVariable的值
                localVariable.set("threadOne local variable");
                //调用打印函数
                print("threadOne");
                //打印本地变量值
                System.out.println("threadOne remove after" + ":" + localVariable.get());
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程Two中本地变量localVariable的值
                localVariable.set("threadTwo local variable");
                //调用打印函数
                print("threadTwo");
                //打印本地变量值
                System.out.println("threadTwo remove after" + ":" + localVariable.get());
            }
        });

        threadOne.start();
        threadTwo.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(localVariable.get());
    }
}
