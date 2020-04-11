package part003线程间通信.part3_3类ThreadLocal的使用.part3_3_1方法get与null;

public class Run {
    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if (t1.get() == null){
            System.out.println("从没有放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
