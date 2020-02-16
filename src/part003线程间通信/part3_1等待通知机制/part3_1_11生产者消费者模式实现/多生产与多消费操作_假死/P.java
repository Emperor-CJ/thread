package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.多生产与多消费操作_假死;

import part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.p_r_test.ValueObject;

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
                while (!ValueObject.value.equals("")){
                    System.out.println("生产者" + Thread.currentThread().getName() + "waiting 了！");
                    lock.wait();
                }
                System.out.println("生产者" + Thread.currentThread().getName() + "Running 了！");
                String value = System.currentTimeMillis() + "_"
                        + System.nanoTime();
                ValueObject.value = value;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
