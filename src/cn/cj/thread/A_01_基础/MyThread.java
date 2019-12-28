package cn.cj.thread.A_01_基础;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("task");
    }

    public static void main(String[] args) {
        new MyThread().start();
    }
}
