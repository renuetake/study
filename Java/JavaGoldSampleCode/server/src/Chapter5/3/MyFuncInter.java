// 独自の関数型インターフェースの実装
@FunctionalInterface
interface MyFuncInter<T> {
    void foo(T t);              // 抽象メソッド
    String toString();          // Objectクラスのpublicメソッド
    boolean equals(Object obj); // Objectクラスのpublicメソッド
    static void X() {};            // staticメソッド
    default void Y() {};           // defaultメソッド
}