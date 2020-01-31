package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_8细化验证3个结论.结论2;

/**
 * Created by chenjie on 2020/1/30.
 */
public class ThreadB extends Thread {

    private MyObect object;
    public ThreadB( MyObect object){
        super();

        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
