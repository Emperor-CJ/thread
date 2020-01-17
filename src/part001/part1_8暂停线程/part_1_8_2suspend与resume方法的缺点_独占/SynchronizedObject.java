package part001.part1_8暂停线程.part_1_8_2suspend与resume方法的缺点_独占;

public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远 suspend 了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
