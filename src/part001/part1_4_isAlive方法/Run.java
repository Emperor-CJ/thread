package part001.part1_4_isAlive方法;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin==" + myThread.isAlive());
        myThread.start();
        System.out.println("end == " + myThread.isAlive());
    }
}
