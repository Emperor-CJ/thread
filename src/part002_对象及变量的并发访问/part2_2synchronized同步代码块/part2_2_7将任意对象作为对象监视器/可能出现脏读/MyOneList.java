package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_7将任意对象作为对象监视器.可能出现脏读;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjie on 2020/1/30.
 */
public class MyOneList {
    private List list = new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    }

    synchronized public int getSize(){
        return list.size();
    }
}
