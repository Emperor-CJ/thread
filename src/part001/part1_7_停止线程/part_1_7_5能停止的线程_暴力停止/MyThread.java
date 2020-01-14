package part001.part1_7_停止线程.part_1_7_5能停止的线程_暴力停止;

public class MyThread extends Thread {
    private  int i = 0;

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
