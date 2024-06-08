// 不適切コード1

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class NGCode1 {
    public static void main(String[] args) {
        
    }
    public void changePassword(String userId, String password) throws SQLException {
        Connection connection = DbConnector.getConnect();
        if (connection == null) {
            // 接続失敗時のエラー処理
        }
        try {
            String h_password = hasPassword(password); // パスワードのハッシュ化
            // 以下でプレースホルダを使用せずに文字列のまま処理を実施しているため、SQLインジェクションが行われる
            String sql = "UPDATE user SET " + 
                        "user_password = " + h_password + " " +
                        "WHERE user_id = " + userId + "";
            Statement stmt = connection.createStatement();
            System.out.println(sql);
            int count = stmt.executeUpdate(sql);
            if(count == 0){
                throw new SystemException("更新失敗");
            }
            // 更新されたとして次の処理に進む
        } finally {
            try {
                connection.close();
            } catch (SQLException x) {
                // ハンドラへ処理を渡す
            }
        }
    }
}