package part001.part1_11守护线程;

/**
 * MyThread
 *
 * @Author: chenjie
 * @Date: 2020/1/20
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try{
            while (true){
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
