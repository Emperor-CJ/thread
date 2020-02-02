package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_16锁对象的改变.根据Run2做的进一步验证;

/**
 * Created by chenjie on 2020/2/2.
 */
public class Userinfo {
    private String username;
    private String password;

    public Userinfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Userinfo() {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
