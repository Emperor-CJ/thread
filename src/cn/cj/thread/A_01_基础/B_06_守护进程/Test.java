package cn.cj.thread.A_01_基础.B_06_守护进程;

public class Test {


    public static void main(String[] args) {
        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("=========");
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
