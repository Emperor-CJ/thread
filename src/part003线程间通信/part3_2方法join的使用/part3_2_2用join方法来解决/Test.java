package part003线程间通信.part3_2方法join的使用.part3_2_2用join方法来解决;



/**
 * Created by chenjie on 2020/2/18.
 */
public class Test {
    public static void main(String[] args) {
        try{
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("我想当threadTest对象执行完毕后我再执行");

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
