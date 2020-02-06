package part003线程间通信.part3_1等待通知机制.part3_1_3等待_通知机制的实现;

/**
 * Created by chenjie on 2020/2/6.
 * 出现异常的原因是没有"对象监视器"，也就是没有同步加锁
 */
public class Test1 {
    public static void main(String[] args) {
        try{
            String newString = new String("");
            newString.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
