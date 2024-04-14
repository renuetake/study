// try-with-resources文の使用例1
import java.sql.*;

class MyResource implements AutoCloseable {
    private String msg;
    public MyResource(String msg){ this.msg = msg; }
    public void close() throws Exception {
        System.out.println("close() : " + msg);
    }
}

public class Main {

    public static void main(String[] args) {
        try (MyResource obj1 = new MyResource("obj1");
             MyResource obj2 = new MyResource("obj2")) {
            
            System.out.println("try ブロック内の処理");
            throw new SQLException();
        } catch (SQLException e){
            System.out.println("catch ブロック : SQLException");
        } catch (Exception e) {
            System.out.println("catch ブロック : Exception");
        } finally {
            System.out.println("finally ブロック");
        }
    }
}