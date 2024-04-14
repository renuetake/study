// try-with-resources 文の使用例2
import java.sql.*;
class MyResource implements AutoCloseable {
    private String msg;
    public MyResource(String msg) { this.msg = msg; }
    public void method() throws SQLException {
        throw new SQLException("method()でのエラー");
    }
    public void close() throws SQLException {
        System.out.println("close() : " + msg);
        throw new SQLException("close()でのエラー : " + msg);
    }
}

public class Main {
    public static void main(String[] args) {
        try (
            MyResource obj1 = new MyResource("obj1");
            MyResource obj2 = new MyResource("obj2")
        ){
            obj1.method();
        } catch (SQLException e){
            System.out.println("e.getMessage() : " + e.getMessage());
            System.out.println("e.getSuppressed()で取り出した情報");
            Throwable[] errAry = e.getSuppressed();
            System.err.println(" 抑制例外数 : " + errAry.length);
            for (Throwable ex : errAry) {
                System.out.println(" " + ex.getMessage());
            }
        } finally {
            System.out.println("finally ブロック");
        }
    }    
}