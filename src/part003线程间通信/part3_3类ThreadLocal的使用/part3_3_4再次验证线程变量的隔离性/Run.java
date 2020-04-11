package part003线程间通信.part3_3类ThreadLocal的使用.part3_3_4再次验证线程变量的隔离性;

public class Run {
    public static void main(String[] args) {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("在main 线程中取值 =" + Tools.t1.get());
                Thread.sleep(100);
            }

            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
