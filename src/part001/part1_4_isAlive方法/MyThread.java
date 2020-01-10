package part001.part1_4_isAlive方法;

public class MyThread extends Thread {
    public MyThread(){
        super();
        System.out.println("run=" + this.isAlive());
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().isAlive());
        System.out.println("run=" + this.isAlive());
    }
}
