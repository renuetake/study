// executeUpdate()メソッドによるINSERT処理

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String sql = "INSERT INTO department VALUES " +
                    "(6, 'Planning', 'yokohama', '045-333-xxxx')";
        try (
            Connection con = DbConnector.getConnect();
            PreparedStatement pstmt = con.prepareStatement(sql)
        ){
            int col = pstmt.executeUpdate();
            System.out.println("col : " + col);
        } catch (SQLException e){ e.printStackTrace(); }
    }
}