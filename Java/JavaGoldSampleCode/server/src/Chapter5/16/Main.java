// メソッド参照でのエラー

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Stringクラスのインスタンスメソッドである length()
        //Function<String, Integer> f1 = s -> s.length();
        Function<String, Integer> f1 = String::length;
        System.out.println(f1.apply("Java"));

        // Stringクラスのstaticメソッドである valueOf(int)
        //Function<Integer, String> f2 = s -> String.valueOf(s);
        Function<Integer, String> f2 = String::valueOf;
        System.out.println(f2.apply(10));

        // Integerクラスのインスタンスメソッドであえる hashCode()
        Function<Integer, Integer> f3 = i -> i.hashCode();
        System.out.println(f3.apply(10));
        // コンパイルエラー
        // staticメソッドのhashCode()とインスタンスメソッドのhashCode()のどちらを呼ぶか特定できない
        Function<Integer, Integer> f4 = Integer::hashCode;
    }
}