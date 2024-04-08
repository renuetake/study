// ローカルクラスの定義
class Outer {
    private static int a = 1;   // static変数
    private int b = 2;          // インスタンス変数
    void methodOuter(final int c, int d){
        final int e = 5; int f = 6;
        class A {
            void method() {
                System.out.print(a + " ");
                System.out.print(b + " ");
                System.out.print(c + " ");
                System.out.print(d + " ");
                System.out.print(e + " ");
                System.out.print(f);
                // d = 100; // NG 暗黙的にfinal修飾子が付与されるため
                // f = 100; // NG 暗黙的にfinal修飾子が付与されるため
            }
        }
        new A().method();
    }
}
public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.methodOuter(3, 4);
    }
}