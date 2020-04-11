package part003线程间通信.part3_3类ThreadLocal的使用.part3_3_4再次验证线程变量的隔离性;

public class ThreadA extends Thread {
    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
