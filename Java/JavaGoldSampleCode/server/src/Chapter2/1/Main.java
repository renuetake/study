// アノテーション未使用の例
class Parent {
    void bar() { // メソッド名が「bar」
        System.out.println("Parent#bar()");
    }
}
class Child extends Parent {
    void bal() { // メソッド名が「bal」（オーバーライドできてない）
        System.out.println("Child#bar()");
    }
}
public class Main {
    public static void main(String[] args) {
        new Child().bar(); // 「bar」というメソッドはParentにしかないので、親を呼び出し
    }
}