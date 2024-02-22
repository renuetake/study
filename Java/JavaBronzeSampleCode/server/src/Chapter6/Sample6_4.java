package Chapter6;
class Test {
    String myPrint(int a, String b) { return "test"; } // 1. このメソッドに対して2 ~ 5の方法でオーバーロードしてみる
    String myPrint(int a, int b) { return "test"; }    // 2. 2つ目の引数が異なるため、適切なオーバーロード
    String myPrint(String a, int b) { return "test"; } // 3. 引数の並びが異なるため、適切なオーバーロード
    // String myPrint(int a, String b) { }                // 4. 引数の型、並び、数が同じであり、戻り値だけがことなる。これはオーバーロードとはみなされないので、コンパイルエラー
    // String myPrint(int a, String y) { return "test"; } // 5. 引数の変数名が変わっているが、型、並び、数が同じためオーバーロードとはみなされない。→コンパイルエラー
}
public class Sample6_4 {
}
