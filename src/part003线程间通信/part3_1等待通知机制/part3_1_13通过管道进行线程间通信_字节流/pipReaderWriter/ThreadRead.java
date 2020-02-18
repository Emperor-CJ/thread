package part003线程间通信.part3_1等待通知机制.part3_1_13通过管道进行线程间通信_字节流.pipReaderWriter;

import java.io.PipedReader;

/**
 * Created by chenjie on 2020/2/18.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input){
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
