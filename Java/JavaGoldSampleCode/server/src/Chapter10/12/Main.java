// absolute()メソッドの利用

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT dept_code FROM department " +
                    "ORDER BY dept_code";
        try(
            Connection con = DbConnector.getConnect();
            PreparedStatement pstmt = con.prepareStatement(
                sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE)
        ){
            ResultSet rs = pstmt.executeQuery();
            rs.absolute(1);
            System.out.print(rs.getString(1) + " ");
            rs.absolute(-1);
            System.out.print(rs.getString(1) + " ");
            rs.absolute(-2);
            System.out.println(rs.getString(1));
        } catch (SQLException e){e.printStackTrace();}
    }
}