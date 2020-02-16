package part003线程间通信.part3_1等待通知机制.part3_1_11生产者消费者模式实现.多生产与多消费_操作栈;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjie on 2020/2/9.
 */
public class MyStack {
    private List list = new ArrayList();
    synchronized public void push(){
        try{
            while (list.size() == 1){
                this.wait();
            }
            list.add("anyString=" + Math.random());
            this.notify();
            System.out.println("push=" + list.size());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

   synchronized public String pop(){
       String returnValue = "";
       try{
           while (list.size() == 0){
               System.out.println("pop 操作中的：" +
               Thread.currentThread().getName() + " 线程呈wait状态");
               this.wait();
           }
           returnValue = "" + list.get(0);
           list.remove(0);
           this.notify();
           System.out.println("pop=" + list.size());
       }catch (InterruptedException e){
           e.printStackTrace();
       }
       return returnValue;
   }
}
