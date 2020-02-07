package part003线程间通信.part3_1等待通知机制.part3_1_9通知过早;

/**
 * Created by chenjie on 2020/2/7.
 */
public class MyRun {
    private String lock = new String("");
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock){
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
            }
        }
    };

    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread a = new Thread(run.runnableA);
        a.start();
        Thread b = new Thread(run.runnableB);
        b.start();
    }
}
