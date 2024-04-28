// format()メソッドの利用

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        String template = "こんにちは{0}さん。私は{1}です。";
        Object[] params = {"Duke", "Taro"};
        String msg = MessageFormat.format(template, params);
        System.out.println(msg);
    }
}