// ネストクラスでのインターフェースや抽象クラスの定義
class Test {
    abstract class A { abstract void foo(); }
    class B extends A { void foo() {} }
    static interface X {void bar(); }
    static class Y implements X { public void bar() { } }
}