package Chapter6;

public class Sample6_7 {
    int instanceVal; // インスタンス変数
    static int staticVal; // static 変数

    int methodA() { return instanceVal; }           // 1. OK インスタンスメソッド → インスタンス変数なので、問題なし
    int methodB() { return staticVal; }             // 2. OK インスタンスメソッド → static 変数なので、問題なし
    // static int methodC() { return instanceVal; } // 3. NG static メソッド → インスタンス変数なので、コメントを外すとコンパイルエラー
    static int methodD() { return staticVal; }      // 4. OK static メソッド → static 変数なので、問題なし
    static int methodE() {                          // 5. OK static メソッド内で自クラスをインスタンス化し、変数 obj.インスタンス変数でアクセスしているので、問題なし
        Sample6_7 obj = new Sample6_7();
        return obj.instanceVal; 
    }
}
