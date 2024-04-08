// インターフェースでのstaticメソッドの定義と利用
interface Foo {
    static void method() { // 暗黙的にpublicが付与される
        System.out.println("Foo : method()");
    }
}

public class Main {
    public static void main(String[] args) {
        Foo.method();
        // Foo obj = new Foo(); obj.method(); // インターフェースはインスタンス化できないため、コンパイルエラー
    }
}