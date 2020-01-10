package part001.part1_3currentThread方法;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();    //这个就是子线程执行
        //myThread.run();    //这个是main执行
    }
}
