package part001.part1_2_3实例变量与线程安全;

public class MyThread extends Thread {
    private int count = 5;
    public MyThread(String name){
        super();
        this.setName(name);
    }
    public MyThread(){
        super();
    }

//    @Override
//    public void run() {
//        super.run();
//        while (count > 0){
//            count--;
//            System.out.println("由 " + currentThread().getName() + " 计算， count=" + count);
//        }
//    }

    @Override
    synchronized public void run() {
        super.run();
        while (count > 0){
            count--;
            System.out.println("由 " + currentThread().getName() + " 计算， count=" + count);
        }
    }


}
