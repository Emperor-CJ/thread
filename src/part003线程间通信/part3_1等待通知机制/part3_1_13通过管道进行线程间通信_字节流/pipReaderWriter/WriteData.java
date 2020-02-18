package part003线程间通信.part3_1等待通知机制.part3_1_13通过管道进行线程间通信_字节流.pipReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * Created by chenjie on 2020/2/18.
 */
public class WriteData {
    public void writeMethod(PipedWriter out){
        try{
            System.out.println("write :");
            for (int i = 0; i < 300; i++) {
                String outdata = "" + (i+1);
                out.write(outdata);
                System.out.print(outdata);
            }
            System.out.println();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
