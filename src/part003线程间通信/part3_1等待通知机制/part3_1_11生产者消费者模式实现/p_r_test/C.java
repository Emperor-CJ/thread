package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.p_r_test;

/**
 * Created by chenjie on 2020/2/7.
 */
public class C {
    private String lock;
    public C(String lock){
        super();
        this.lock = lock;
    }
    public void getValue(){
        try{
            synchronized (lock){
                if (ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get 的值是"+ ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
