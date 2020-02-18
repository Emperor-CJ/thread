package part003线程间通信.part3_2方法join的使用.part3_2_4方法join_long的使用;

/**
 * Created by chenjie on 2020/2/18.
 */
public class Test {
    public static void main(String[] args) {
        try{
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join(2000);
            System.out.println(" end timer=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
