// @FunctionalInterface使用の例2
// インターフェースの定義としては正しいものの、関数型インターフェースとしての要件を満たしていないためコンパイルエラー
@FunctionalInterface
interface FuncInter<T> {
    boolean equals(Object obj);
}