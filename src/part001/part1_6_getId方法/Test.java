package part001.part1_6_getId方法;

/**
 * Created by chenjie on 2020/1/12.
 */
public class Test {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}
