// 暗黙的finalを確認する1

import java.util.function.Function;

public class Main {
    int a = 10;
    public void method() {
        final int b = 20;
        int c = 30; // 実質的final
        int d = 40;
        d = 50;
        int e = 60; // 実質的final
        Function<String, String> f1 = (String str) -> {
            System.out.println("a : " + a);
            System.out.println("b : " + b);
            System.out.println("c : " + c);
            // System.out.println("d : " + d); // コンパイルエラー
            // e = 100; //コンパイルエラー
            return "Hello " + str;
        };
        System.out.println(f1.apply("naoki"));
    }
    public static void main(String[] args) {
        new Main().method();
    }
}