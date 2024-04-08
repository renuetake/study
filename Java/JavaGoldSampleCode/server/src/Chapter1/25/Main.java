// メソッド内でネストクラスをインスタンス化する方法その１
public class Main { //外側のクラス
    class A { // 非staticクラス
        void methodA() { System.out.println("methodA()"); }
    }
    static class B { // staticクラス
        static void methodB() { System.out.println("methodB()"); }
    }
    public static void main(String[] args) {
        new Main().new A().methodA();   // new A().methodA(); はNG
        new Main.B().methodB();         // new B().methodB(); でもOK
        Main.B.methodB();               // B.methodB(); でもOK
    }
}