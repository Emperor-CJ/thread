package cn.cj.thread.A_02.B_01如何使用unsafe类;

import sun.misc.Unsafe;

public class TestUnsafe {
    //获取unsafe的实例
    static final Unsafe unsafe = Unsafe.getUnsafe();

    //记录变量state在类TestUnsafe中的偏移量
    static final long stateOffset;

    //
    private volatile long state = 0;
    static {
        try {
            stateOffset = unsafe.objectFieldOffset(TestUnsafe.class.getDeclaredField("state"));
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            throw new Error(e);
        }
    }

    public static void main(String[] args) {
        TestUnsafe testUnsafe = new TestUnsafe();
        Boolean success = unsafe.compareAndSwapInt(testUnsafe,stateOffset,0,1);
        System.out.println(success);
    }
}
