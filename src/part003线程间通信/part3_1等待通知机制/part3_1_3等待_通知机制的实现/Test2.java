package part003线程间通信.part3_1等待通知机制.part3_1_3等待_通知机制的实现;

/**
 * Created by chenjie on 2020/2/6.
 *
 */
public class Test2 {
    public static void main(String[] args) {
        try{
            String lock = new String();
            System.out.println("syn 上面");
            synchronized (lock){
                System.out.println("syn 第一行");
                lock.wait();
                System.out.println("wait 下的代码");
            }
            System.out.println("syn 下面的代码");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
