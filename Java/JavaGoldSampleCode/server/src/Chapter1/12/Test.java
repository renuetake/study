// インターフェースでの不適切なコード
interface Test {
    int a;                      // 暗黙的にpublic static final修飾子が付与されるため、初期化必須
    protected void methodA();   // インターフェースの抽象メソッドはpublicメソッドになるため、不適切なアクセス修飾子は使用できない
    final void methodB();       // 抽象メソッドはオーバーライドする必要があるため、final修飾子も付与できない
    static void methodC();      // インターフェースにはstaticな抽象メソッドは宣言できない
}
