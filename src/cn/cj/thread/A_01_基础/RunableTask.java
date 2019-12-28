package cn.cj.thread.A_01_基础;

public class RunableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("task");
    }


    public static void main(String[] args) {
        RunableTask task = new RunableTask();
        new Thread(task).start();
        new Thread(task).start();
    }
}
