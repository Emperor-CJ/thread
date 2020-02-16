package part003线程间通信.part3_1等待通知机制.part3_1_12通过管道进行线程间通信_字节流.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * Created by chenjie on 2020/2/16.
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;
    public ThreadWrite(WriteData write, PipedOutputStream out){
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
