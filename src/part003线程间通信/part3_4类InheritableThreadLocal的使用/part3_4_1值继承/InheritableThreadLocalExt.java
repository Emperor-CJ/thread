package part003线程间通信.part3_4类InheritableThreadLocal的使用.part3_4_1值继承;

import java.util.Date;

public class InheritableThreadLocalExt extends  InheritableThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
