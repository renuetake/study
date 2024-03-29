package Chapter6;

class SuperA {  // スーパークラス
    public void print(String s) {
        System.out.println("SuperA print: " + s);
    }
    public void method(){ }
}
class SubA extends SuperA { // サブクラス
    public void print(String s) {
        s = "渡された文字列は" + s + "です";
        System.out.println("SubA print: " + s);
    }
    //void method() { } // コンパイルエラー(スーパークラスでの定義=public, サブクラスでの定義=指定なしなため)
}

public class Sample_2 {
    public static void main(String[] args) {
        SuperA obj1 = new SuperA();
        obj1.print("Java"); // 4行目が呼び出される

        SubA obj2 = new SubA();
        obj2.print("Java"); // 10行目が呼び出される
    }
}