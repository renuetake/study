// 19/MyClass.javaと似たような作りでも、片方をクラス、片方をインターフェースにすればコンパイルエラーは起きない
// Javaでは常にクラスが優先される
interface A {
    void method(); //抽象メソッド
}

interface X extends A { // Aインターフェースのサブインターフェース
    @Override
    default void method() { System.out.println("X"); }
}
class Y implements A { // Aインターフェースの実装クラス
    @Override
    public void method() { System.out.println("Y"); }
}
class MyClass extends Y implements X { }

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
    }
}