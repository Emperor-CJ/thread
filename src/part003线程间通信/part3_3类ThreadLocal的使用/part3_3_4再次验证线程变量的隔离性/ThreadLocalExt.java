package part003线程间通信.part3_3类ThreadLocal的使用.part3_3_4再次验证线程变量的隔离性;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();

    }
}
