// 不適切コード

import java.io.File;

public class NGCode {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.home") +
                        System.getProperty("file.separator") +
                        args[0]);
        String absPath = file.getAbsolutePath();
        System.out.println("absPath : " + absPath); //absPath : /home/yuko/mydir
        // args[0]に"../../dev"など、".."が含まれたパス名が指定されると、許可されていないディレクトリへ移動が可能
        // (検証を後にしているため引っかからない)

        // ファイルがセキュアなディレクトリにあるか検証し、
        // 不正な場合は例外をスロー
    }
}