package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.p_r_test;

/**
 * Created by chenjie on 2020/2/7.
 */
public class P {
    private String lock;
    public P(String lock){
        super();
        this.lock = lock;
    }

    public void setValue(){
        try{
            synchronized (lock){
                if (!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_"
                        + System.nanoTime();
                System.out.println("set 的值是" + value);
                ValueObject.value = value;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
