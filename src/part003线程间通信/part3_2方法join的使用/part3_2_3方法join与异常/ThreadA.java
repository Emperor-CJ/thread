package part003线程间通信.part3_2方法join的使用.part3_2_3方法join与异常;

/**
 * Created by chenjie on 2020/2/18.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
