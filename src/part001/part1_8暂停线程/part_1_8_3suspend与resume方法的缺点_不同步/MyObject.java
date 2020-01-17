package part001.part1_8暂停线程.part_1_8_3suspend与resume方法的缺点_不同步;

public class MyObject {
    private String username = "1";
    private String password = "11";
    public void setValue(String u, String p){
        this.username = u;
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("停止a线程");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword(){
        System.out.println(username + " " + password);
    }
}
