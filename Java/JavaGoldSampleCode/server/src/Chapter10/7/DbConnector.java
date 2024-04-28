// 接続専用クラス
import java.sql.*;

public class DbConnector {
    public static Connection getConnect() throws SQLException {
        String url = "jdbc:mysql://db:3306/golddb" +
                    "?verifyServerCertificate=false&" + 
                    "useSSL=false&serverTimezone=Asia/Tokyo";
        Connection con = DriverManager.getConnection(url, "root", "training");
        return con;
    }
}