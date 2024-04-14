// ジェネリックスを用いたインターフェース宣言
interface MyIn<T> { void method(T t); }

class Foo implements MyIn<String> { // 実装クラスの定義
    public void method(String s){ System.out.println(s); }
}

public class Main {
    public static void main(String[] args) {
        new Foo().method("ABC");
        new MyIn<Integer>() { // 匿名クラスを使用した実装例
            public void method(Integer i){ System.out.println(i); }
        }.method(100);
    }
}