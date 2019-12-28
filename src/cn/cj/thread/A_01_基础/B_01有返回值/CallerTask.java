package cn.cj.thread.A_01_基础.B_01有返回值;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallerTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(4000);
        return "hello";
    }

    public static void main(String[] args) {
        //创建异步任务
        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());
        //启动线程
        new Thread(futureTask).start();
        try {
            //等待任务执行完毕，并返回结果
            String result = futureTask.get();
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
