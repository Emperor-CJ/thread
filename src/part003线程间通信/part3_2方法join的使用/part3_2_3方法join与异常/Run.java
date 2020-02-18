package part003线程间通信.part3_2方法join的使用.part3_2_3方法join与异常;

/**
 * Created by chenjie on 2020/2/18.
 */
public class Run {
    public static void main(String[] args) {
        try{
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
