package part003线程间通信.part3_3类ThreadLocal的使用.part3_3_2验证线程变量的隔离性;

import javax.tools.Tool;

public class Run {
    public static void main(String[] args) {
        try{
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("main" + (i + 1));
                System.out.println("main get value=" + Tools.t1.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
