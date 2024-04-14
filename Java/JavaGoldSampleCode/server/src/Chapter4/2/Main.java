// Boxing / Unboxingでの不適切な使用例

import java.util.*;

public class Main {
    public static void main(String[] args) {
        double d1 = 10;                     // OK : 基本データ型暗黙の型変換
        //Double d2 = 10;                   // NG : コンパイルエラー
                                            //      Boxingにおいては暗黙の型変換は行われない

        Long lVal = null;
        //long l_1 = lVal;                  // NG : NullPointerException発生

        Long l_2 = null;
        //l2++;                             // NG : NulPointerException発生

        Map<String, Long> map = new HashMap<>();
        //long l_3 = map.get("H10");        // NG : NullPointerException発生
    }
}