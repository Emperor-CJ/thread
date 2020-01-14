package part001.part1_7_停止线程.part_1_7_5能停止的线程_暴力停止;

public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
