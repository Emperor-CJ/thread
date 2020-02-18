package part003线程间通信.part3_2方法join的使用.part3_2_3方法join与异常;

/**
 * Created by chenjie on 2020/2/18.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try{
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在run end处打印了");
        }catch (InterruptedException e){
            System.out.println("线程B在catch处打印了");
            e.printStackTrace();
        }

    }
}
