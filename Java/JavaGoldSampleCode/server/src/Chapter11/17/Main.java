// MessageFormatをインスタンス化して利用する

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        String template = "こんにちは{0}さん。私は{1}です。";
        Object[][] params = {{"Dule", "Taro"}, {"Nao", "misa"}};
        MessageFormat mf = new MessageFormat(template);
        for (Object[] p : params){
            System.out.println(mf.format(p));
        }
    }
}