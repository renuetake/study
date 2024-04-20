// メソッド参照の例

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Function<String, Integer> f = str -> Integer.parseInt(str); // 普通の書き方
        Function<String, Integer> f = Integer::parseInt;    // メソッド参照での書き方
        int num = f.apply("100");
        System.out.println(num);
    }
}