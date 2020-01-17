package part001.part1_8暂停线程.part_1_8_2suspend与resume方法的缺点_独占;

public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true){
            i++;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
