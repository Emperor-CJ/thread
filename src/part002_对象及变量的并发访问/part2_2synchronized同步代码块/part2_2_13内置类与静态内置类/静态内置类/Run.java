package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_13内置类与静态内置类.静态内置类;

import part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_13内置类与静态内置类.静态内置类.PublicClass.PrivateClass;

/**
 * Created by chenjie on 2020/2/1.
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() + " "
        + publicClass.getPassword());
        PrivateClass privateClass = new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
    }
}
