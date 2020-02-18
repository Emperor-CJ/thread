package part003线程间通信.part3_1等待通知机制.part3_1_14实战_等待通知之交叉备份.wait_notify_insert_test;

/**
 * Created by chenjie on 2020/2/18.
 */
public class BackupB extends Thread {
    private DBTools dbTools;

    public BackupB(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
