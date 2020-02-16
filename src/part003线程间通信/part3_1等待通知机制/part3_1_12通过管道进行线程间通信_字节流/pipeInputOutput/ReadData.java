package part003线程间通信.part3_1等待通知机制.part3_1_12通过管道进行线程间通信_字节流.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by chenjie on 2020/2/16.
 */
public class ReadData {
    public void readMethod(PipedInputStream input){
        try{
            System.out.println("read :");
            byte[] byteArray = new byte[20];
            int readLength = input.read(byteArray);
            while (readLength != -1){
                String newData = new String(byteArray,0,readLength);
                System.out.println("newData = " + newData);
                System.out.println("length :" + readLength);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
