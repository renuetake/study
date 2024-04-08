// デフォルトメソッドの実装クラスでのオーバーライド
interface MyInter1 {
    default void method() { System.out.println("MyInter1"); }
}

class MyClass implements MyInter1 {
    @Override
    public void method() { System.out.println("MyClass"); }
}