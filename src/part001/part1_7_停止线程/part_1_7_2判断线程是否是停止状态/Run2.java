package part001.part1_7_停止线程.part_1_7_2判断线程是否是停止状态;

public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1 ？ =" + Thread.interrupted());
        System.out.println("是否停止2 ？ =" + Thread.interrupted());
        System.out.println("end");

    }
}
