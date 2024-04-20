// インスタンスメソッド参照の例2

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        //UnaryOperator<String> obj = s -> s.toUpperCase(); // ラムダ式
        //UnaryOperator<String> obj = s::toUpperCase; // コンパイルエラー
        UnaryOperator<String> obj = String::toUpperCase;
        System.out.println(obj.apply("naoki"));
    }
}