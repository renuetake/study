// ロケールオブジェクトの取得例1

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        print("デフォルト ", Locale.getDefault());
        print("new Locale() ", new Locale("ja", "JP"));
        print("JAPAN ", Locale.JAPAN);
        print("JAPANESE ", Locale.JAPANESE);
    }

    static void print(String msg, Locale locale){
        System.out.println(msg + ": locale : " + locale);
        System.out.println(msg + ": language : " + locale.getLanguage());
        System.out.println(msg + ": country : " + locale.getCountry());
    }
}