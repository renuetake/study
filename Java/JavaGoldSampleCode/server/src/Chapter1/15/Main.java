// インターフェースでのprivateメソッドの定義と利用
interface Foo {
    private static void p1() {
        System.out.println("Foo : p1()");
    }
    private void p2(){
        System.out.println("Foo : p2()");
    }
    static void methodA() {
        System.out.println("Foo : methodA()");
        p1();
        //p2(); //コンパイルエラー
    }
    default void methodB() {
        System.out.println("Foo : methodB()");
        p1();
        p2();
    }
}

class FooImpl implements Foo {}
public class Main implements Foo {
    public static void main(String[] args) {
        Foo.methodA();
        new FooImpl().methodB();
    }
}
