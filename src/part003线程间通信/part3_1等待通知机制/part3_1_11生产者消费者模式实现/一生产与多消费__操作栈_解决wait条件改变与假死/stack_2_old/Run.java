package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.一生产与多消费__操作栈_解决wait条件改变与假死.stack_2_old;

/**
 * Created by chenjie on 2020/2/16.
 * @author cj
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r1 = new C(myStack);
        C r2 = new C(myStack);
        C r3 = new C(myStack);
        C r4 = new C(myStack);
        C r5 = new C(myStack);
        P_Thread pThread = new P_Thread(p);
        pThread.start();

        C_Thread cThread1 = new C_Thread(r1);
        C_Thread cThread2 = new C_Thread(r2);
        C_Thread cThread3 = new C_Thread(r3);
        C_Thread cThread4 = new C_Thread(r4);
        C_Thread cThread5 = new C_Thread(r5);

        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();

    }
}
