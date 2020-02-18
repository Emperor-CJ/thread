package part003线程间通信.part3_1等待通知机制.part3_1_14实战_等待通知之交叉备份.wait_notify_insert_test;

/**
 * Created by chenjie on 2020/2/18.
 */
public class Run {


    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB output = new BackupB(dbTools);
            output.start();

            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }
}
