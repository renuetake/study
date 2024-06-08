// 対策コード2

import java.io.IOException;
import java.nio.file.Files;

public class OKCode2 {
    public static void main(String[] args) {
        Path file = new File(args[0]).toPath();
        try {
            Files.delete(file); // Files.delete()は削除できなかった場合にIOExceptionをスロー
        } catch (IOException e) {
            // 削除失敗時の処理
        }
    }
}