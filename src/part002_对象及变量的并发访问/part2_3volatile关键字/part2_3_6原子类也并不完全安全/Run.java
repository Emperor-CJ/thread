package part002_对象及变量的并发访问.part2_3volatile关键字.part2_3_6原子类也并不完全安全;

/**
 * Created by chenjie on 2020/2/5.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyService service = new MyService();
            MyThread[] array = new MyThread[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new MyThread(service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
