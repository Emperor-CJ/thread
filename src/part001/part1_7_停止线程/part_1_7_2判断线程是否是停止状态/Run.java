package part001.part1_7_停止线程.part_1_7_2判断线程是否是停止状态;

public class Run {
    public static void main(String[] args) {
        try{
            Mythread mythread = new Mythread();
            mythread.start();
            Thread.sleep(1000);
            mythread.interrupt();
            System.out.println("是否停止1 ？ =" + mythread.interrupted());
            System.out.println("是否停止2 ？ =" + mythread.interrupted());
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
