// インターフェース宣言と実装クラス
interface MyInter1 {
    double methodA(int num);
    default void methodB() { System.out.println("methodB()"); }
}
interface MyInter2 {
    int methodC(int val1, int val2);
    static void methodD() { System.out.println("mthodD()"); }
}
class MyClass implements MyInter1, MyInter2 {
    @Override
    public double methodA(int num) { return num * 0.3; }
    @Override
    public int methodC(int val1, int val2) { return val1 + val2; }
}
public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("mthodA() " + obj.methodA(10));
        System.out.println("mthodC() " + obj.methodC(10, 20));
        obj.methodB();      // デフォルトメソッドの呼び出し
        MyInter2.methodD(); // staticメソッドの呼び出し
        //obj.methodD();    // コンパイルエラー
    }
}