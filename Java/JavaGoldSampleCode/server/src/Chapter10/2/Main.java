// SQL型から日付/時刻型への変換

import java.sql.*; // 1. java.sqlパッケージのインポート

public class Main {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM mytableA";

        try {
            // 2. データベースの指定
            String url = "jdbc:mysql://db:3306/golddb" +
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
                java.sql.Date sqlDate = rs.getDate(1);
                java.time.LocalDate localDate = sqlDate.toLocalDate();
                System.out.println("localDate : " + localDate);

                java.sql.Time sqlTime = rs.getTime(2);
                java.time.LocalTime localTime = sqlTime.toLocalTime();
                System.out.println("localTime : " + localTime);

                java.sql.Timestamp timestamp = rs.getTimestamp(3);
                java.time.LocalDateTime localDateTime = timestamp.toLocalDateTime();
                System.out.println("localDateTime : " + localDateTime);
        
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
