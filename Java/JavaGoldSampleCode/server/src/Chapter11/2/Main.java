// ロケールオブジェクトの取得例2

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US"); // 米国
        System.out.println(us.getDisplayCountry() + " : " + us.getDisplayLanguage());
        System.out.println(us.getDisplayCountry(us) + " : " + us.getDisplayLanguage(us));
        Locale japan = new Locale.Builder().setLanguage("ja")
                            .setRegion("JP").build();
        System.out.println(japan.getCountry() + " : " + japan.getLanguage());

    }
}