// 暗黙的finalを確認する2

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        int i = 25;
        Supplier<Integer> s = () -> i;
        i++; // ラムダ式内でアクセスしてる変数に対して更新処理記述しているのでコンパイルエラー
        System.out.println(s.get());
    }
}