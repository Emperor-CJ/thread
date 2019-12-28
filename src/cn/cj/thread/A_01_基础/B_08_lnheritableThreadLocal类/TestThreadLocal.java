package cn.cj.thread.A_01_基础.B_08_lnheritableThreadLocal类;

public class TestThreadLocal {
    //创建线程变量
//    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("hello word");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("thread set");
                System.out.println("thread:" + threadLocal.get());
            }
        });

        thread.start();
        System.out.println("main :" + threadLocal.get());
    }
}
