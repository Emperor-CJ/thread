package part003线程间通信.part3_2方法join的使用.part3_2_6方法join后面的代码提前运行_出现意外.joinMoreTetst;

public class Run1 {
    public static void main(String[] args) {
        try{
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("main end " + System.currentTimeMillis() );
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
