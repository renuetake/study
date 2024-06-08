// 不適切コード2

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NGCode2 {
    public static void main(String[] args) {
        
    }
    public void changePassword(String userId, String password) throws SQLException {
        Connection connection = DbConnector.getConnect();
        if (connection == null){
            // 接続失敗時のエラー処理
        }
        try {
            String h_password = hashPassword(password);
            String sql = "UPDATE user SET " +
                        "user_password=" + h_password + " " +
                        "WHERE user_id=" + userId + "";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            int count = pstmt.executeUpdate();
            if (count == 0) {
                throw new SystemException("更新失敗");
            }
            // 更新されたとして次の処理に進む
        } finally {
            try {
                connectiton.close();
            } catch (SQLException x){
                // ハンドラへ処理を渡す
            }
        }
    }
}