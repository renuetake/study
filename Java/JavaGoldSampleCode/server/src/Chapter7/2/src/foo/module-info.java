// 2/src/foo/module-info.java
// fooモジュール宣言の例
module foo {
    exports xlib;
    requires java.base; // java.baseはすべてのモジュールに暗黙的に含まれるため、省略可能
    requires transitive bar;
}