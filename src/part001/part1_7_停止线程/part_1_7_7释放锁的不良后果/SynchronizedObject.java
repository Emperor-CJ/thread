package part001.part1_7_停止线程.part_1_7_7释放锁的不良后果;

public class SynchronizedObject {
    private String username = "a";
    private String password = "aa";

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

    synchronized public void printString(String username, String password){
        try {
            this.username = username;
            Thread.sleep(100000);
            this.password = password;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
