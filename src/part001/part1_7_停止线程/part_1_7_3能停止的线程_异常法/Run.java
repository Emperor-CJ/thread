package part001.part1_7_停止线程.part_1_7_3能停止的线程_异常法;

public class Run {
    public static void main(String[] args) {
        try{
            MyTread myTread = new MyTread();
            myTread.start();
            Thread.sleep(1000);
            myTread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
