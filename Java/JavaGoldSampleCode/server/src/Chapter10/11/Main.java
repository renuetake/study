// スクロール可能なResultSetオブジェクトの使用例

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT dept_code, dept_name FROM department " +
                    "ORDER BY dept_code";
        try(
            Connection con = DbConnector.getConnect();
            PreparedStatement pstmt = con.prepareStatement(
                sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE)
        ) {
            ResultSet rs = pstmt.executeQuery();
            rs.last(); // 最終行に移動
            System.out.println("最後の行番号: " + rs.getRow());
            rs.afterLast(); // 最終行の次の行に移動
            while(rs.previous()){ // 逆方向にスクロール
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
        } catch (SQLException e) { e.printStackTrace();}
    }
}