// setObject()メソッドとsetNull()オブジェクト

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String sql = "INSERT INTO department VALUES " +
                    "(?, ?, ?, ?)";
        Object pilot_number = null;
        if (args.length == 1) pilot_number = args[0];
        try(
            Connection con = DbConnector.getConnect();
            PreparedStatement pstmt = con.prepareStatement(sql)
        ) {
            pstmt.setInt(1, 8);
            pstmt.setString(2, "Support");
            pstmt.setString(3, "Miyagi");
            if (pilot_number == null){
                pstmt.setNull(4, java.sql.Types.NULL);
            } else {
                pstmt.setObject(4, pilot_number, java.sql.Types.VARCHAR);
            }
            int col =pstmt.executeUpdate();
            System.out.println("col : " + col);
        } catch (SQLException e) { e.printStackTrace(); }
    }
}