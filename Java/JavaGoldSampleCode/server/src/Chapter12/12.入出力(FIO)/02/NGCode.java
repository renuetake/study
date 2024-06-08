// 不適切コード

import java.io.File;

public class NGCode {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            file.delete(); // delete()メソッドは戻り値としてbooleanを返す。
            // このコードでは正常に削除されたか、されなかったかが検知できない
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}