// DecimalFormatクラスを使用した例

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("00000000.000", 123456.789);
        customFormat("$###,###.###", 123456.789);
        customFormat("\u00a5###,###.###", 123456.789);
    }
    static public void customFormat(String pattern, double value){
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String fData = myFormat.format(value);
        System.out.println(fData);
    }
}