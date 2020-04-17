package part003线程间通信;

import cn.Field1;
import sun.rmi.runtime.Log;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
      Field1 field1 = new Field1();
      Class<? extends Field1> clz = field1.getClass();
      Field de = clz.getDeclaredField("name1");
      de.setAccessible(true);
      de.set(field1,"cj");
        System.out.println(field1);
    }
}
