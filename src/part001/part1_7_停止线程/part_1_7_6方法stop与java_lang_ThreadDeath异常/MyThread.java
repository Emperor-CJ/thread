package part001.part1_7_停止线程.part_1_7_6方法stop与java_lang_ThreadDeath异常;

public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            this.stop();
        }catch (ThreadDeath e){
            System.out.println("进入了catch()方法");
            e.printStackTrace();
        }
    }
}
