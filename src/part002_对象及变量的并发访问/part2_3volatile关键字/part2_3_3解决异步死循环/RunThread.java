package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_3解决异步死循环;

/**
 * Created by chenjie on 2020/2/2.
 */
public class RunThread extends Thread {
    //private boolean isRunning = true;
    volatile private boolean isRunning = true;
    public boolean isRunning(){
        return isRunning;
    }
    public void setRunning(boolean isRunning){
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning == true){

        }
        System.out.println("线程被停止了！");
    }
}
