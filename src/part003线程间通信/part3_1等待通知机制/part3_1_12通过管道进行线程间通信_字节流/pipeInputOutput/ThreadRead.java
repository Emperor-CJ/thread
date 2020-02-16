package part003线程间通信.part3_1等待通知机制.part3_1_12通过管道进行线程间通信_字节流.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * Created by chenjie on 2020/2/16.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input){
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
