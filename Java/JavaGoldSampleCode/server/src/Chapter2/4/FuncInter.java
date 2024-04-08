// @FunctionalInterface未使用の例
// (関数型インターフェースの要件を満たしていないが、インターフェースとしての定義としては正しいためコンパイルエラーにならない)
interface FuncInter<T> {
    boolean equals(Object obj);
}