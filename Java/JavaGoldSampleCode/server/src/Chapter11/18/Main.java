// リソースバンドルでのMessageFormatの利用

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyResources", Locale.FRANCE);
        //Object[] params = {"Duke"};
        String params = "Duke";
        String msg = MessageFormat.format(bundle.getString("message"), params);
        System.out.println(msg);
    }
}