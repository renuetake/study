// 外部クラスでネストクラスをインスタンス化する
class Outer { // 外側のクラス
    private int val1 = 100;         // インスタンス変数
    private static int val2 = 200;  // static変数
    class A { // 非staticクラス(インナークラス)
        void method1() { //非staticメソッド
            System.out.println("A#method1()#instance val1 : " + val1);
            System.out.println("A#method1()#static val2   : " + val2);
        //static void method2() { // staticメソッド(非staticクラスにstaticメンバは持てない)
            // System.out.println("A#method2()#instance val1 : " + val1);
            // System.out.println("A#method2()#static val2   : " + val2);
        }
    }
    static class B { // staticクラス
        void method1() { //非staticメソッド
            // System.out.println("B#method1()#instance val1 : " + val1); // 外側のクラスで定義したインスタンス変数にアクセスできない
            System.out.println("B#method1()#static val2   : " + val2);
        }
        static void method2() { // staticメソッド
            // System.out.println("B#method2()#instance val1 : " + val1); // 外側のクラスで定義したインスタンス変数にアクセスできない
            System.out.println("B#method2()#static val2   : " + val2);
        }
    }
}
public class Main { // 外部のクラス
    public static void main(String[] args) {
        Outer.A a = new Outer().new A();    // 非staticクラスのインスタンス化
        Outer.B b = new Outer.B();          // staticクラスのインスタンス化
        a.method1(); b.method2();
    }
}