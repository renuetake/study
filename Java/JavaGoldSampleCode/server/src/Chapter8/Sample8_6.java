package Chapter8;


abstract class Foo {
    int x; int y;
    public abstract void print();
    public void method(int x, int y) { this.x = x; this.y = y;}
}
class MyClass extends Foo {
    public void print() {
        System.out.println("x : " + x + " y : " + y);
    }
}
public class Sample8_6 {
    public static void main(String[] args) {
        // スーパークラスの変数に、サブクラスのオブジェクトを代入
        Foo f = new MyClass();
        f.method(10, 20);   // スーパークラスのメソッド呼び出しOK
        f.print();              // サブクラスのメソッド呼び出しOK
    }
}
