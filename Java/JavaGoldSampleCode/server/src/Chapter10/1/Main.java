// JDBCの使用例

import java.sql.*; // 1. java.sqlパッケージのインポート

public class Main {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT dept_code, dept_name FROM department";

        try {
            // 2. データベースの指定
            String url = "jdbc:mysql://172.20.0.3:3306/golddb" +
                        "?verifyServerCertificate=false&" + 
                        "useSSL=false&serverTimezone=Asia/Tokyo";
            // 3. データベースとの接続
            con = DriverManager.getConnection(url, "root", "training");

            // 4. ステートメントの取得
            pstmt = con.prepareStatement(sql);

            // 5. sql文の実行
            rs = pstmt.executeQuery();

            // 6. 結果の取得と処理
            while(rs.next()){
                System.out.println("dept_code : " + rs.getInt(1));
                System.out.println("dept_name : " + rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. 接続のクローズ
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}
