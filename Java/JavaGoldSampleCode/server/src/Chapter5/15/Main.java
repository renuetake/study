// インスタンスメソッド参照の例3

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // ラムダ式1 OK
        BiFunction<String, Integer, Character> bf1 = (s, i) -> s.charAt(i);
        System.out.println(bf1.apply("Java", 2));

        // ラムダ式2
        BiFunction<Integer, String, Character> bf2 = (i, s) -> s.charAt(i);
        System.out.println(bf2.apply(2, "Java"));

        // インスタンスメソッド参照1 OK
        BiFunction<String, Integer, Character> bf3 = String::charAt;
        System.out.println(bf3.apply("Java", 2));

        // インスタンスメソッド参照2 NG
        //BiFunction<Integer, String, Character> bf4 = String::charAt;
        //System.out.println(bf4.apply(2, "Java"));
    }
}