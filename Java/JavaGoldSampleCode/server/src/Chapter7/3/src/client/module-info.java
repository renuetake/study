// 3/src/client/module-info.java
// clientモジュール宣言の例
module client {
    // requires foo; // jarファイル名から補完される名前を指定する
    requires com.foo; // Automatic-Module-Nameの名前
}