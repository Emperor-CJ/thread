package part003线程间通信.part3_1等待通知机制.part3_1_1不使用等待_通知机制实现线程间通信;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjie on 2020/2/5.
 */
public class MyList {
    private List list = new ArrayList();
    public void add(){
        list.add("cj");
    }
    public int size(){
        return list.size();
    }
}
