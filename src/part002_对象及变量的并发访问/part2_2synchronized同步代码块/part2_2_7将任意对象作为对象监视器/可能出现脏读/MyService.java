package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_7将任意对象作为对象监视器.可能出现脏读;

/**
 * Created by chenjie on 2020/1/30.
 */
public class MyService {
    public MyOneList addServiceMEthod(MyOneList list, String data){
        try{
            if (list.getSize() < 1){
                //模拟从远程花费2秒取回数据
                Thread.sleep(2000);
                list.add(data);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return list;
    }
}
