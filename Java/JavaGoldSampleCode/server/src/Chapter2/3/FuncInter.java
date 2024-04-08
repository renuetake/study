// @FunctionalInterface使用の例1(問題ない場合)
@FunctionalInterface
interface FuncInter<T> {
    void foo(T t);              // 抽象メソッド
    String toString();          // Objectクラスのpublicメソッド
    boolean equals(Object obj); // Objectクラスのpublicメソッド
    static void X() { };        // staticメソッド
    default void Y() { };       // defaultメソッド
}