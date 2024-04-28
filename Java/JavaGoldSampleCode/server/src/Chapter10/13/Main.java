// 更新処理をおこなうResultSetオブジェクトの使用例

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT dept_code, dept_address FROM department " +
                    "WHERE dept_code = 4";
        try (
            Connection con = DbConnector.getConnect();
            PreparedStatement pstmt = con.prepareStatement(
                sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE)
            ){
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) System.out.println(rs.getString(2));
                rs.updateString(2, "Chiba");
                rs.updateRow();
            } catch (SQLException e) {e.printStackTrace();}
    }
}