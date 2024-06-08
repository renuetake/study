// 対策コード1

import java.io.File;

public class OKCode1 {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            boolean flag = file.delete();
            if (flag == false) {
                System.out.println("削除失敗");
            } else {
                // 削除が成功した際の処理
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}