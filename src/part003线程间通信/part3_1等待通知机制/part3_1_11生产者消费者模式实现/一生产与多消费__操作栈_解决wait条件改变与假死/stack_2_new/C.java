package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.一生产与多消费__操作栈_解决wait条件改变与假死.stack_2_new;

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
