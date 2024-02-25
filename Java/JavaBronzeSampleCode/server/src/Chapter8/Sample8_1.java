package Chapter8;
abstract class Super { // 抽象クラス
    protected abstract void methodA();  // 抽象メソッド
    public void methodB() {}            // 具象メソッド
}
class Sub extends Super { // 具象クラス
    protected void methodA() {} // 必須 // 抽象メソッドは必ず定義
    // 以下でもOK アクセス修飾子っは同じか公開範囲の広いものを使用
    // public void methodA() {}
    public void methodB() {}    // 任意 // 必要に応じて実装可能
}
public class Sample8_1 {
    
}
