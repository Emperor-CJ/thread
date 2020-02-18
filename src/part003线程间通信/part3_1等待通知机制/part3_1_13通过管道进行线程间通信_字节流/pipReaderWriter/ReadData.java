package part003线程间通信.part3_1等待通知机制.part3_1_13通过管道进行线程间通信_字节流.pipReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

/**
 * Created by chenjie on 2020/2/18.
 */
public class ReadData {
    public void readMethod(PipedReader input){
        try{
            System.out.println("read :");
            char[] byteArray = new char[20];
            int readLength = input.read(byteArray);
            while (readLength != -1){
                String newData = new String(byteArray,0,readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
