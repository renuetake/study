// INパラメータの利用

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT dept_name FROM department " +
                    "WHERE dept_code = ? OR dept_code = ?";
        try (
            Connection con = DbConnector.getConnect();
            PreparedStatement pstmt = con.prepareStatement(sql)
            ){
                pstmt.setInt(1, 1);
                pstmt.setInt(2, 3);
                
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()){
                    System.out.println("dept_name : " + rs.getString(1));
                }
            } catch (SQLException e) { e.printStackTrace();}

    }
}