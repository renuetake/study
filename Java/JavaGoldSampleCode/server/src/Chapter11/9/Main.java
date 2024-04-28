// NumberFormatクラスを使用した例

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        NumberFormat jpNum = NumberFormat.getInstance(); // 日本
        NumberFormat jpCur = NumberFormat.getCurrencyInstance();
        System.out.println("日本の数値 : " + jpNum.format(50000));
        System.out.println("日本の通貨 : " + jpCur.format(50000));

        NumberFormat usNum = NumberFormat.getInstance(Locale.US); // 米国
        NumberFormat usCur = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("米国の数値 : " + usNum.format(50000));
        System.out.println("米国の通貨 : " + usCur.format(50000));

    }
}