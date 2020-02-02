package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_1关键字volatile与死循环;

/**
 * Created by chenjie on 2020/2/2.
 */
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("我要停止她！stopThread=" + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
