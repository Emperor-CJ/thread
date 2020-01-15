package part001.part1_7_停止线程.part_1_7_7释放锁的不良后果;

public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {

        object.printString("b","bb");
    }
}
