package part003线程间通信.part3_2方法join的使用.part3_2_6方法join后面的代码提前运行_出现意外.joinMoreTetst;

public class ThreadB extends Thread {
    @Override
    synchronized public void run() {
        try{
            System.out.println("begin B ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end B ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
