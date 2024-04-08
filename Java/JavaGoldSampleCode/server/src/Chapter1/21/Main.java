// 呼び出し先の明示化
interface A {
    void method(); // 抽象メソッド
}

interface X extends A { // Aインターフェースのサブインターフェース
    @Override
    default void method() { System.out.println("X"); }
}

interface Y extends A { // Aインターフェースのサブインターフェース
    @Override
    default void method() { System.out.println("Y"); }
}
class MyClass implements X, Y {
    @Override
    public void method() { X.super.method(); } // 親インターフェース名.super.メソッド名()とする(superがついてるが、呼ばれるのはXのメソッド)
 }
 public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
    }
 }