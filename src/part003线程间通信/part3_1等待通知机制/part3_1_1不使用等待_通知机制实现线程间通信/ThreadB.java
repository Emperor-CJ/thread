package part003线程间通信.part3_1等待通知机制.part3_1_1不使用等待_通知机制实现线程间通信;

/**
 * Created by chenjie on 2020/2/5.
 */
public class ThreadB extends Thread {
    private MyList list;
    public ThreadB(MyList list){
        super();
        this.list = list;
    }


    //如果用while 轮询机制来检测的话，可能线程B一直没有抢占到cpu，会出现下面代码一直没有执行的情况
    @Override
    public void run() {
        try{
            while (true){
                if (list.size() == 5){
                    System.out.println("==5了， 线程b要退出了！");
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
