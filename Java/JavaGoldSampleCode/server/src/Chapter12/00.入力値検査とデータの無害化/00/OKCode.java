// 対策コード

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OKCode {
    public static void main(String[] args) {
        
    }
    public void changePassword(String userId, String password) throws SQLException {
        Connection connection = DbConnector.getConnect();
        if (connection == null){
            // 接続失敗時のエラー処理
        }

        try {
            String h_password = hashPassword(password);
            // userIdに対して、入力値の妥当性チェック (文字数や使用可否の記号、数字などのチェック)
            if (userId.length() > 10){
                //エラー処理
            }
            // PreparedStatementのINパラメータを活用し、SQLインジェクション対策を実施
            String sql = "UPDATE user SET " +
                        "user_password=? " +
                        "WHERE user_id=?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, h_password);
            pstmt.setString(2, userId);
            int count = pstmt.executeUpdate();
            if (count == 0){
                throw new SystemException("更新失敗");
            }
            //更新されたとして次の処理に進む
        } finally {
            try {
                connection.close();
            } catch (SQLException e){
                // ハンドラへ処理を渡す
            }
        }
    }
}