// 19/MyClass.javaでのコンパイルエラーの回避方法
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
    public void method() { System.out.println("MyClass"); } // method()をオーバーライドすればOK
 }
 public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
    }
 }
