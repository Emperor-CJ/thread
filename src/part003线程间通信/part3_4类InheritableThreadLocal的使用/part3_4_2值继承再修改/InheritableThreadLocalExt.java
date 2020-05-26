package part003线程间通信.part3_4类InheritableThreadLocal的使用.part3_4_2值继承再修改;

import java.util.Date;

public class InheritableThreadLocalExt extends  InheritableThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + " 我在子线程加的~";
    }
}
