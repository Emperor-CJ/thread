package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_7synchronized代码块有volatile同步的功能;

/**
 * Created by chenjie on 2020/2/5.
 */
public class Service {
    private boolean isContinueRun = true;
    public void runMethod(){
        String anyString = new String();
        while (isContinueRun == true){
//            synchronized (anyString){
//
//            }
        }
        System.out.println("停下来了！");
    }
    public void stopMethod(){
        isContinueRun = false;
    }
}
