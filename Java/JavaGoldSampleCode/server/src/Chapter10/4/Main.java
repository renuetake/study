// ResultSetの特徴

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT dept_name FROM department " + 
                    "WHERE pilot_number = ?";
        try (
            Connection con = DbConnector.getConnect();
            PreparedStatement pstmt = con.prepareStatement(sql)
            ){
                pstmt.setString(1, args[0]);
                ResultSet rs = pstmt.executeQuery();
                if (rs != null) System.out.println("rs != null");
                if (rs.next()){
                    System.out.println("dept_name : " + rs.getString(1));
                }
        } catch (SQLException e) { e.printStackTrace(); }
    }
}