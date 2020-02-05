package part003线程间通信.part3_1等待通知机制.part3_1_1不使用等待_通知机制实现线程间通信;

/**
 * Created by chenjie on 2020/2/5.
 */
public class ThreadA extends Thread {
    private MyList list;
    public ThreadA(MyList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {

        try{
            for (int i = 0; i < 10; i++) {
                list.add();
                System.out.println("添加了" + (i + 1) + "个元素");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
