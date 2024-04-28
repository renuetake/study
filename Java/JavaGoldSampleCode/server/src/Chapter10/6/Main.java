// executeUpdate()メソッドによるUPDATE処理

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String sql = "UPDATE department set " +
                    "dept_address='Tokyo', pilot_number='03-6666-xxxx' "+
                    "WHERE dept_code = ?";
        try (
            Connection con = DbConnector.getConnect();
            PreparedStatement pstmt = con.prepareStatement(sql)
        ) {
            pstmt.setInt(1, Integer.parseInt(args[0]));
            int col = pstmt.executeUpdate();
            System.out.println("col : " + col);
        } catch (SQLException e) { e.printStackTrace(); }
    }
}