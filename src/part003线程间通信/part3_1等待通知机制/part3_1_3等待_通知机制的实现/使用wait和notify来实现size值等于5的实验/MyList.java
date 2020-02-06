package part003线程间通信.part3_1等待通知机制.part3_1_3等待_通知机制的实现.使用wait和notify来实现size值等于5的实验;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjie on 2020/2/6.
 */
public class MyList {
    private static List list = new ArrayList();
    public static void add(){
        list.add("cj");
    }

    public static int size(){
        return list.size();
    }
}
