package part001.part1_7_停止线程.part_1_7_4在沉睡中停止;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        super.run();
        try{
            for (int i = 0; i <1000000 ; i++) {
                System.out.println("i=" + (i+1));
            }
            System.out.println("run begin");
            Thread.sleep(2000000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("先停止，再遇到sleep，进入catch!" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
