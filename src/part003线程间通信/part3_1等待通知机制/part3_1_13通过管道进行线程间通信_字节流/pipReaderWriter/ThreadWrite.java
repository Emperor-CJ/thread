package part003线程间通信.part3_1等待通知机制.part3_1_13通过管道进行线程间通信_字节流.pipReaderWriter;

import java.io.PipedWriter;

/**
 * Created by chenjie on 2020/2/18.
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedWriter out;

    public ThreadWrite(WriteData write, PipedWriter out){
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
