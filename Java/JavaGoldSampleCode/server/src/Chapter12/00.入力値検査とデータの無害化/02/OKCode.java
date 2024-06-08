// 対策コード

import java.io.File;

public class OKCode {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.home") + 
                            System.getProperty("file.separator")+
                            args[0]);
        String absPath = file.getCanonicalPath();; // getCanonicalPath()の利用
        System.out.println("absPath : " + absPath); // absPath : /work

        // ファイルがセキュアなディレクトリにあるか検証し
        // 不正の場合は、例外をスロー
    }
}