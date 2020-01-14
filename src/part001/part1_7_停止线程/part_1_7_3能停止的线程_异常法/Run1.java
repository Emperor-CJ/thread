package part001.part1_7_停止线程.part_1_7_3能停止的线程_异常法;

public class Run1 {
    public static void main(String[] args) {
        try{
            MyTread1 myTread = new MyTread1();
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
