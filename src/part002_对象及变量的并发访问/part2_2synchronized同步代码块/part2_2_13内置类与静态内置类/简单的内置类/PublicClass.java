package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_13内置类与静态内置类.简单的内置类;

/**
 * Created by chenjie on 2020/2/1.
 */
public class PublicClass {
    private String username;
    private String password;
    class PrivateClass{
        private String age;
        private String address;
        public String getAge(){
            return age;
        }
        public void setAge(String age){
            this.age = age;
        }

        public String getAddress(){
            return address;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public void printPublicProperty(){
            System.out.println(username + " " + password);
        }
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
