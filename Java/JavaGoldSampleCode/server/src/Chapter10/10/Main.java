// CallableStatementの使用例

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String csql = "{call myprocedure(?,?)}";
        try(
            Connection con = DbConnector.getConnect();
            CallableStatement cstmt = con.prepareCall(csql)
        ) {
            cstmt.setInt(1, 10000);
            cstmt.registerOutParameter(2, java.sql.Types.BIGINT);
            cstmt.execute();
            int result = cstmt.getInt(2);
            System.out.println(result);
        }catch (SQLException e) { e.printStackTrace(); }
    } 
}