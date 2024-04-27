// format()メソッドの使用

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        String compName = "SE社";
        String name = "tanaka";
        int age = 20;
        Formatter fm = new Formatter();
        fm.format("会社名は%sです。\n", compName);
        fm.format("名前：%2$s\t年齢 : %1$d\n", age, name);
        System.out.println(fm);
        System.out.format("会社名は%sです。\n", compName);
        System.out.printf("名前 : %2$s\t年齢 : %1$d\n", age, name);
    }
}