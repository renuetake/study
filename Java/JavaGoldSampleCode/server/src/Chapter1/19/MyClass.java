// 1つのインターフェース → 2つのサブインターフェース → 1つの実装クラス
// どちらのメソッドを呼ぶか判断がつかないためコンパイルエラー
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
class MyClass implements X, Y { } // このクラスが原因でコンパイルエラー
