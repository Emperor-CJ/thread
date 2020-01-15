package part001.part1_7_停止线程.part_1_7_7释放锁的不良后果;

public class Run {
    public static void main(String[] args) {
        try{
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + "  " + object.getPassword());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
