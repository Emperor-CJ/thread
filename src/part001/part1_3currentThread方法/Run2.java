package part001.part1_3currentThread方法;

public class Run2 {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        c.setName("A");
        c.start();
//        Thread t1 = new Thread(c);
//        t1.setName("A");
//        t1.start();
    }
}
