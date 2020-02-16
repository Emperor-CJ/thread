package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.一生产与一消费_操作栈;

/**
 * Created by chenjie on 2020/2/16.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r = new C(myStack);
        P_Thread pThread = new P_Thread(p);
        C_Thread cThread = new C_Thread(r);
        pThread.start();
        cThread.start();
    }
}
