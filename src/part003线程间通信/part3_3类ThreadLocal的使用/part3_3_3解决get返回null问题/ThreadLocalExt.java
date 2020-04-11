package part003线程间通信.part3_3类ThreadLocal的使用.part3_3_3解决get返回null问题;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值 ，第一次get不再为null";
    }
}
