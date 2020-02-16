package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.多生产与一消费_操作栈.stack_3;

/**
 * Created by chenjie on 2020/2/16.
 */
public class C {
    private MyStack myStack;
    public C(MyStack myStack){
        super();
        this.myStack = myStack;
    }
    public void popService(){
        System.out.println("pop=" + myStack.pop());
    }
}
