package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.多生产与一消费_操作栈.stack_3;

/**
 * Created by chenjie on 2020/2/16.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);
        P_Thread pThread1 = new P_Thread(p1);
        P_Thread pThread2 = new P_Thread(p2);
        P_Thread pThread3 = new P_Thread(p3);
        P_Thread pThread4 = new P_Thread(p4);
        P_Thread pThread5 = new P_Thread(p5);
        P_Thread pThread6 = new P_Thread(p6);

        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();
        pThread6.start();

        C c1 = new C(myStack);
        C_Thread cThread = new C_Thread(c1);
        cThread.start();

    }
}
