package part001.part1_7_停止线程.part_1_7_4在沉睡中停止;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        try{
            System.out.println("run begin");
            Thread.sleep(2000000);
            System.out.println("run end");
        }catch (InterruptedException e){
            //在sleep状态下停止某一线程，会进入catch ，并且清除停止状态
            System.out.println("在沉睡中被停止，进入catch!" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
