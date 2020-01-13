package part001.part1_7_停止线程.part_1_7_1停止不了的线程;

/**
 * Created by chenjie on 2020/1/12.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();   //虽然调用了interrupt但其实并没有真正停止，还是全部打印
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
