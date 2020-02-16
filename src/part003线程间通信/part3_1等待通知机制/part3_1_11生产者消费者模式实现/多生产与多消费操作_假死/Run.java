package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.多生产与多消费操作_假死;

/**
 * Created by chenjie on 2020/2/7.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);
        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] rThread = new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者" + (i+ 1));
            rThread[i]= new ThreadC(r);
            rThread[i].setName("消费者" + (i + 1));
            pThread[i].start();
            rThread[i].start();
        }
        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName()+ " " + threadArray[i].getState());
        }
    }
}
