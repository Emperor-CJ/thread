package part003线程间通信.part3_1等待通知机制.part3_1_13通过管道进行线程间通信_字节流.pipReaderWriter;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Created by chenjie on 2020/2/18.
 */
public class Run {

    public static void main(String[] args) {
        try{
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedReader inputStream = new PipedReader();
            PipedWriter outputStream = new PipedWriter();

            outputStream.connect(inputStream);

            ThreadRead threadRead = new ThreadRead(readData,inputStream);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData,outputStream);
            threadWrite.start();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
